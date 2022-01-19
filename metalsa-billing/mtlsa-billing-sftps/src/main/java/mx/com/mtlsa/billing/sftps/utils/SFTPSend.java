package mx.com.mtlsa.billing.sftps.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;
import com.jcraft.jsch.ChannelSftp.LsEntry;


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
	
	
	public static List<String> saveRutaFacturas(List<String> listaFile) {
		
		 	List<String> listFileAdd = new ArrayList<String>();
		   
	        try {
	        	
	        	JSch jsch = new JSch();
		        Session session = null;
	        	
	            session = jsch.getSession("TESTMT920131CN5", "as2telco.ekomercio.com", 22);
	            session.setConfig("StrictHostKeyChecking", "no");
	            session.setPassword("AR2zcYAM");
	            session.connect();

	            Channel channel = session.openChannel("sftp");
	            channel.connect();
	            ChannelSftp sftpChannel = (ChannelSftp) channel;
	            
	            Vector filelist = sftpChannel.ls("XML");
	            
	            for(int i=0; i<filelist.size();i++){
	            	boolean existe = false;
	                LsEntry entry = (LsEntry) filelist.get(i);
	                System.out.println(entry.getFilename());
	                
	                
	                if(entry.getFilename().contains(".PDF")||entry.getFilename().contains(".pdf") ||
	                		entry.getFilename().contains(".XML")||entry.getFilename().contains(".xml")	) {
	                	
		                if(!listaFile.isEmpty() || listaFile.isEmpty()) {
		                	for(String valor: listaFile) {
		                		if(entry.getFilename().contains(valor)) {
		                			existe = true;
		                			break;
		                		}
		                	}
		                }
		                
		                if(!existe) {
							listFileAdd.add(entry.getFilename());
							sftpChannel.get("XML/"+entry.getFilename(), "\\\\faewapo01\\Export\\Ekomercio\\"+entry.getFilename());
					           
						}
	                }
	             }
	            
	         
	            
	            
	            sftpChannel.exit();
	            session.disconnect();
	        } catch (JSchException e) {
	            e.printStackTrace();  
	        } catch (SftpException e) {
	            e.printStackTrace();
	        }
	        
	        
	        return listFileAdd;

	
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
