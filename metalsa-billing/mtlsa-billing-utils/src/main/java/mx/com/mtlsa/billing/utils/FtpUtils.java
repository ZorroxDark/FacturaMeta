package mx.com.mtlsa.billing.utils;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;

import java.io.*;
import java.net.MalformedURLException;

public class FtpUtils {
// dirección del servidor ftp
	public String hostname = "as2telco.ekomercio.com";
// El número de puerto del servidor FTP es 21 de forma predeterminada
	public Integer port = 22;
// cuenta de inicio de sesión ftp
	public String username = "TESTMT920131CN5";
// contraseña de inicio de sesión ftp
	public String password = "AR2zcYAM";

	public static FTPClient ftpClient = null;

// Codificación de caracteres locales
	static String LOCAL_CHARSET = "UTF-8";

// En el protocolo FTP, la codificación del nombre del archivo se especifica como iso-8859-1
	static String SERVER_CHARSET = "ISO-8859-1";

	/**
	 * Inicializar el servidor ftp
	 */
	public void initFtpClient() {
		ftpClient = new FTPClient();
		ftpClient.setControlEncoding(LOCAL_CHARSET);
		try {
			System.out.println("conectando ... servidor ftp:" + this.hostname + ":" + this.port);
			ftpClient.connect(hostname, port); // Conéctate al servidor ftp
			ftpClient.login(username, password); // Inicie sesión en el servidor ftp
			int replyCode = ftpClient.getReplyCode(); // Si iniciar sesión en el servidor con éxito
			if (!FTPReply.isPositiveCompletion(replyCode)) {
				System.out.println("falló la conexión ... servidor ftp:" + this.hostname + ":" + this.port);
			}
			System.out.println("conectar con éxito ... servidor ftp:" + this.hostname + ":" + this.port);
			ftpClient.sendCommand("OPTS UTF8", "ON");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * subir archivos
	 * 
	 * @param pathname       ftp service guardar dirección
	 * @param fileName       nombre del archivo cargado en ftp
	 * @param originfilename El nombre del archivo a cargar (dirección absoluta) *
	 * @return
	 */
	public boolean uploadFile(String pathname, String fileName, String originfilename) {
		boolean flag = false;
		InputStream inputStream = null;
		try {
			System.out.println("Comienza a subir archivos");
			inputStream = new FileInputStream(new File(originfilename));
			initFtpClient();
			ftpClient.enterLocalPassiveMode();
			ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
			CreateDirecroty(pathname);
			ftpClient.makeDirectory(pathname);
			ftpClient.changeWorkingDirectory(pathname);
			ftpClient.storeFile(new String(fileName.getBytes(LOCAL_CHARSET), SERVER_CHARSET), inputStream);

//            ftpClient.storeFile(fileName, inputStream);
			inputStream.close();
			ftpClient.logout();
			flag = true;
			System.out.println("Carga de archivos exitosa");
		} catch (Exception e) {
			System.out.println("Error al cargar el archivo");
			e.printStackTrace();
		} finally {
			if (ftpClient.isConnected()) {
				try {
					ftpClient.disconnect();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (null != inputStream) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return flag;
	}

// Cambiar ruta del directorio
	public boolean changeWorkingDirectory(String directory) {
		boolean flag = true;
		try {
			flag = ftpClient.changeWorkingDirectory(directory);
			if (flag) {
				System.out.println("Ingresar carpeta" + directory + "¡Éxito!");

			} else {
				System.out.println("Ingresar carpeta" + directory + "¡Falló! Comience a crear la carpeta");
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return flag;
	}

// Cree un archivo de directorio multicapa, si el archivo ya existe en el servidor ftp, no lo cree, si no, créelo
	public boolean CreateDirecroty(String remote) throws IOException {
		boolean success = true;
		String directory = remote + "/";
		// Si el directorio remoto no existe, cree recursivamente el directorio del
		// servidor remoto
		if (!directory.equalsIgnoreCase("/") && !changeWorkingDirectory(new String(directory))) {
			int start = 0;
			int end = 0;
			if (directory.startsWith("/")) {
				start = 1;
			} else {
				start = 0;
			}
			end = directory.indexOf("/", start);
			String path = "";
			String paths = "";
			while (true) {
				String subDirectory = new String(remote.substring(start, end).getBytes("GBK"), "iso-8859-1");
				path = path + "/" + subDirectory;
				if (!existFile(path)) {
					if (makeDirectory(subDirectory)) {
						changeWorkingDirectory(subDirectory);
					} else {
						System.out.println("Crear un directorio [" + subDirectory + "]fracaso");
						changeWorkingDirectory(subDirectory);
					}
				} else {
					changeWorkingDirectory(subDirectory);
				}

				paths = paths + "/" + subDirectory;
				start = end + 1;
				end = directory.indexOf("/", start);
				// Comprueba si todos los directorios están creados
				if (end <= start) {
					break;
				}
			}
		}
		return success;
	}

// Crear un directorio
	public boolean makeDirectory(String dir) {
		boolean flag = true;
		try {
			flag = ftpClient.makeDirectory(dir);
			if (flag) {
				System.out.println("Crear carpeta" + dir + "¡Éxito!");

			} else {
				System.out.println("Crear carpeta" + dir + "¡Ha fallado!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 * * descargar archivo *
	 * 
	 * @param pathname  directorio del archivo del servidor FTP *
	 * @param nombre    de archivo nombre de archivo *
	 * @param localpath La ruta del archivo después de la descarga *
	 * @return
	 */
	public boolean downloadFile(String pathname, String filename, String localpath) {
		boolean flag = false;
		OutputStream os = null;
		try {
			System.out.println("Comenzar a descargar archivos");
			initFtpClient();
			// Cambiar directorio FTP
			ftpClient.changeWorkingDirectory(pathname);
			FTPFile[] ftpFiles = ftpClient.listFiles();
			for (FTPFile file : ftpFiles) {
				if (filename.equalsIgnoreCase(file.getName())) {
					File localFile = new File(localpath + "/" + file.getName());
					os = new FileOutputStream(localFile);
					ftpClient.retrieveFile(file.getName(), os);
					os.close();
				}
			}
			ftpClient.logout();
			flag = true;
			System.out.println("Archivo descargado con éxito");
		} catch (Exception e) {
			System.out.println("Error al descargar el archivo");
			e.printStackTrace();
		} finally {
			if (ftpClient.isConnected()) {
				try {
					ftpClient.disconnect();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (null != os) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return flag;
	}

// Determinar si el archivo del servidor ftp existe
	private boolean existFile(String path) throws IOException {
		boolean flag = false;
		FTPFile[] ftpFileArr = ftpClient.listFiles(path);
		if (ftpFileArr.length > 0) {
			flag = true;
		}
		return flag;
	}
}
