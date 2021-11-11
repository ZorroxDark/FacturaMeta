package mx.com.mtlsa.billing.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class SFTPSend {
	
	public SFTPSend() {
		
	}
	
	public static String  SFTPSendTXT(String nomFile) {
		
		File file = new File(nomFile);
		byte fileContent[] = new byte[(int) file.length()];
		FileInputStream fin;
		// Read image in byte array
		try {
			fin = new FileInputStream(file);
			fin.read(fileContent);
			SFTPUtils sftpUtils = new SFTPUtils();
			sftpUtils.setHostName("as2telco.ekomercio.com");
			sftpUtils.setHostPort("22");
			sftpUtils.setUserName("TESTMT920131CN5");
			sftpUtils.setPassWord("AR2zcYAM");
			sftpUtils.setDestinationDir("IN");
			String result = "";
			result = sftpUtils.uploadFileToFTP(nomFile, fin, true);
			System.out.println("TXT upload: " + result);

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error when  read file");
		}
		
		return "";
		
	}
	
	public static String  SFTPSendTXT_2(String nomFile, FileInputStream fin) throws FileNotFoundException, IOException {
			
			SFTPUtils sftpUtils = new SFTPUtils();
			sftpUtils.setHostName("as2telco.ekomercio.com");
			sftpUtils.setHostPort("22");
			sftpUtils.setUserName("TESTMT920131CN5");
			sftpUtils.setPassWord("AR2zcYAM");
			sftpUtils.setDestinationDir("IN");
			String result = "";
			result = sftpUtils.uploadFileToFTP(nomFile, fin, true);
			System.out.println("TXT upload: " + result);
			
			return "";
			
		}
	
	
	public static String  SFTPSendTXTNomina(String nomFile, FileInputStream fin) throws FileNotFoundException, IOException {
		
		SFTPUtils sftpUtils = new SFTPUtils();
		sftpUtils.setHostName("as2telco.ekomercio.com");
		sftpUtils.setHostPort("22");
		sftpUtils.setUserName("TESTMET920131CN5");
		sftpUtils.setPassWord("FFCzdQc6");
		sftpUtils.setDestinationDir("IN");
		String result = "";
		result = sftpUtils.uploadFileToFTP(nomFile, fin, true);
		System.out.println("TXT upload: " + result);
		
		return "";
		
	}
	
	public static String  SFTPSendTXTNomina2(String nomFile, FileInputStream fin) throws FileNotFoundException, IOException {
		
		SFTPUtils sftpUtils = new SFTPUtils();
		sftpUtils.setHostName("as2telco.ekomercio.com");
		sftpUtils.setHostPort("22");
		sftpUtils.setUserName("TESTMET920131CN5");
		sftpUtils.setPassWord("FFCzdQc6");
		sftpUtils.setDestinationDir("ENTRADA");
		String result = "";
		result = sftpUtils.uploadFileToFTP(nomFile, fin, true);
		System.out.println("TXT upload: " + result);
		
		return "";
		
	}
	
//	public static String rutaSftpTXT() {
//		
//		String directorioRaiz="";
//		
//		try {
//			
//			 directorioRaiz = System.getProperty("user.dir")+"\\TempFile\\";
//			 System.out.println("La ruta "+directorioRaiz);
//			
//		}catch(Exception e) {
//			System.out.println("Error al obtener la ruta "+e);
//			directorioRaiz = null;
//		}
//		
//		return directorioRaiz;
//	}
	

}
