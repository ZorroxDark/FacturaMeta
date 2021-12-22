package mx.com.mtlsa.billing.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

public class Test {

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
	            
	            
	            sftpChannel.get("XML/GPR880111PA8_XAXX010101000__20211201014959_20211201.pdf", "C:\\Users\\Usuario\\Documents\\Doc\\archivoNvo.pdf");
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
