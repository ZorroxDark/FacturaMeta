package mx.com.mtlsa.billing.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Vector;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.ChannelSftp.LsEntry;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

import jcifs.smb.NtlmPasswordAuthentication;
import jcifs.smb.SmbException;
import jcifs.smb.SmbFile;
import jcifs.smb.SmbFileOutputStream;

public class Test {
	
	
//	public static void main(String[] args) throws MalformedURLException {
		
//		CIFSContext base = SingletonContext.getInstance();
//        CIFSContext authed1 = base.withCredentials(new NtlmPasswordAuthentication(base, "domainName",
//                "userName", "password"));
//        try (SmbFile f = new SmbFile("smb:\\serverName\folder", authed1)) {
//            if (f.exists()) {
//                for (SmbFile file : f.listFiles()) {
//                    System.out.println(file.getName());
//                }
//            }
//        }
//	

		
//		try {
//			String url =  "smb:\\\\faewapo01\\Export\\Ekomercio";
//			String user = "miguel.velazquez";
//		    String pass = "Metalsa22";
			
//			 NtlmPasswordAuthentication auth = new NtlmPasswordAuthentication("", "miguel.velazquez", "Metalsa22");
//		     SmbFile dir = new SmbFile(url, auth);
//			 for (SmbFile f : dir.listFiles())
//			 {
//			   System.out.println(f.getName());
//			 }
//			
			
//			String user = "miguel.velazquez";
//		    String pass ="Metalsa22";
//
//		    String sharedFolder="shared";
//		    String path="smb://10.9.46.75/";//+sharedFolder; //"/test.txt";
//		    NtlmPasswordAuthentication auth = new NtlmPasswordAuthentication("",user, pass);
//		    SmbFile smbFile = new SmbFile(url,auth);
		    
		    
//		    for (SmbFile f : smbFile.listFiles())
//				 {
//				   System.out.println(f.getName());
//				 }
//		    SmbFileOutputStream smbfos = new SmbFileOutputStream(smbFile);
//		    smbfos.write("testing....and writing to a file".getBytes());
//		    System.out.println("completed ...nice !");
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//	}

	public static void main(String[] args) {
		   JSch jsch = new JSch();
	        Session session = null;
	        try {
	            session = jsch.getSession("TESTMT920131CN5", "as2telco.ekomercio.com", 22);
	            session.setConfig("StrictHostKeyChecking", "no");
	            session.setPassword("AR2zcYAM");
	            session.connect();

	            Channel channel = session.openChannel("sftp");
	            channel.connect();
	            ChannelSftp sftpChannel = (ChannelSftp) channel;
	            
	            Vector filelist = sftpChannel.ls("XML");
	            for(int i=0; i<filelist.size();i++){
	                LsEntry entry = (LsEntry) filelist.get(i);
	                System.out.println(entry.getFilename());
	            }
	            
	            System.out.println("-----------------------------------");
	            
	            File carpeta = new File("\\\\faewapo01\\Export\\Ekomercio\\");
	            String[] listado = carpeta.list();
	            if (listado == null || listado.length == 0) {
	                System.out.println("No hay elementos dentro de la carpeta actual");
	                return;
	            }
	            else {
	                for (int i=0; i< listado.length; i++) {
	                    System.out.println(listado[i]);
	                }
	            }
	            
	            
	            //sftpChannel.get("XML/GPR880111PA8_XAXX010101000__20211201014959_20211201.pdf", "\\\\faewapo01\\Export\\Ekomercio\\archivoNvo.pdf");
	            sftpChannel.exit();
	            session.disconnect();
	        } catch (JSchException e) {
	            e.printStackTrace();  
	        } catch (SftpException e) {
	            e.printStackTrace();
	        }

	}
	
	
	/** 
	 //		// TODO Auto-generated method stub
//		
//	    FtpUtils ftp =new FtpUtils();
//	    ftp.uploadFile("/files/", "Factura.txt", "C:\\Users\\miguel.velazquez\\Documents\\ArchivosTxt\\Factura.txt");
//	    //ftp.uploadFile("/FTP service directory / "," nombre de archivo "," ruta de archivo y nombre de archivo ");

		File file = new File("C:\\Users\\miguel.velazquez\\Documents\\ArchivosTxt\\A221770D_0000000002_5.txt");
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
			result = sftpUtils.uploadFileToFTP("A221770D_0000000002_5.txt", fin, true);
			System.out.println("TXT upload: " + result);

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error when  read file");
		}
	 **/
	 

}
