package mx.com.mtlsa.billing.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.axis.encoding.Base64;

import mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfString;
import mx.com.mtlsa.billing.client.cancelaciones.WSCFDICancelacion;
import mx.com.mtlsa.billing.client.cancelaciones.WSCFDICancelacionSoap;

//
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.StringReader;
//
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
//import org.json.XML;
//import org.w3c.dom.Document;
//import org.xml.sax.InputSource;
//
//import mx.com.mtlsa.billing.client.edixcfdisecure.ReceiveCFDResponse;
//import mx.com.mtlsa.billing.client.edixcfdisecure.WSCFDBuilderPlus;
//import mx.com.mtlsa.billing.client.edixcfdisecure.WSCFDBuilderPlusSoap;
//import mx.com.mtlsa.billing.dto.response.txt.EspecOrdEncaFacElecTxtDTO;
//import mx.com.mtlsa.billing.dto.response.txt.EspecOrdLineDetCfdTxtDTO;
//import mx.com.mtlsa.billing.dto.response.txt.EspecOrdLineImpuestoCfdTxtDTO;
//import mx.com.mtlsa.billing.utils.Constantes;
//import mx.com.mtlsa.billing.utils.txt.GeneraStringComplemento;
//import mx.com.mtlsa.billing.utils.txt.GeneraStringFacturas;
//import mx.com.mtlsa.billing.utils.txt.GenerarStringImpuesto;
//
//
public class test {
//
	public static void main(String[] args) {
		
		cancelaciones();
//	
//		String valor ="~237|METALSA SA DE CV|MET920131CN5|Carr. Miguel Aleman Km. 16|100|||APODACA|Apodaca NL|APODACA|NLE|MEX|66600|01(81)8369-7400|Carr. Miguel Aleman Km. 16|100|||Apodaca||Apodaca|NLE|MEX|66600||3.3|||PPD|2021-09-09|00:50:24|Carr. Miguel Aleman Km. 16|100|||Apodaca||Apodaca|NLE|MEX|66600|TOYOTA MOTOR ENGINEERING & MANUFACTURING NORTH AME|XEXX010101000|6565 HEADQUARTERS DR.||||PLANO|||TX|USA|75024|1508.42|0.00|1508.42|1|FA|BULTOS: 1 CHASIS.     PESO BRUTO: 209.89 LB.,||rhurt@tmmna.com; kgriggs@mail.tmmna.com; hector.ramirez.clemente@metalsa.com; samuel.rodriguez@metalsa.com; juan.enriquez@metalsa.com;||||A237979D|||||0874C|WONDRIES TOYOTA SG 151543 W. MAIN ST.|||||ALHAMBRA|ZIP CODE: 918011949||CA|USA|918011949|XEXX010101000|USD|45|0|0|0|0|0|1||||||87460253|N45|||One Thousand Five Hundred Eight Dlls and 42/100 Cents|1.0000||||||||1508.42|S.R. Trucking/Orbi Logistic||USD|47|||1500|2021-09-09 00:50:24.363||REG.CAM.IND.TRANSF. N.L. 0049 REG. PATRONAL 03-061245-10 REG.FISCAL DE EXP. E IMP. 62245-00-6|||||2|0|||||||[EM]|0||20.3907|73.98000000000000000|TOYOTA MOTOR ENGINEE|||||A237979D|611310582|DDP|||||||||||||||||||0|0|ORIGINAL||601,||||||||0||20.3907|N45||||||||||||PPD|ingreso|0.00|0.00\r\n";
//		
//		String array[] =valor.split("\\|");
//		
//		int con=0;
//		
//		for(String t :array) {
//			
//			System.out.println(con+" "+t);
//			con++;
//		}
//				
		
	}
	
	
	public static void cancelaciones() {
		
		try {

//			encodeTest();
//			encodeFileToBase64Binary();
			
			WSCFDICancelacionSoap wSCFDBuilderPlusSoap = new WSCFDICancelacion().getWSCFDICancelacionSoap();	
			
		
			RespuestaDTOOfString respuesta = new RespuestaDTOOfString();	
			
			respuesta =wSCFDBuilderPlusSoap.guardarCertificadoSUC
			/*("SUCMET0621", "SUCMET0621*21","MET920131CN5", 
					encodeFileToBase64BinaryCER(), 
					encodeFileToBase64BinaryKEY(), 
					"met.9201");*/
			("SUCMET0621", "SUCMET0621*21","GPR880111PA8", 
					encodeFileToBase64BinaryCER(), 
					encodeFileToBase64BinaryKEY(), 
					"Proeza88");
		
		System.out.println("--> "+respuesta.getMensaje());
		System.out.println("--> "+respuesta.getDatos());
		System.out.println("--> "+respuesta.toString());
		
		}catch(Exception e) {
			System.out.println("Error : ");
		}
		
	}
	
	
	public static String encodeFileToBase64BinaryCER() throws IOException {
	    //File file = new File("C:\\Users\\\\Usuario\\Documents\\OmarCodigo_29_Nov_21\\CSD_MET920131CN5_20211025100335\\00001000000509573393.cer");
	    File file = new File("C:\\Users\\\\Usuario\\Documents\\\\Firmas\\FIEL_GPR880111PA8_20181004_152208\\00001000000412307270.cer");
	    
		// File file = new File("C:\\Users\\Usuario\\Documents\\Firmas\\FIEL_MET920131CN5_20200921113405\\WSCFDICancelacion_v16.pdf");
		    
	    String base64File = "";
        //File file = new File(filePath);
        try  {
        	
        	FileInputStream imageInFile = new FileInputStream(file);
            // Reading a file from file system
            byte fileData[] = new byte[(int) file.length()];
            imageInFile.read(fileData);
            base64File = Base64.encode(fileData);
        } catch (FileNotFoundException e) {
            System.out.println("File not found" + e);
        } catch (IOException ioe) {
            System.out.println("Exception while reading the file " + ioe);
        }
       
        System.out.println("Hola");
        System.out.println(base64File.toString());
	    
        return base64File;
	    
	}
	
	public static String encodeFileToBase64BinaryKEY() throws IOException {
		   // File file = new File("C:\\Users\\Usuario\\Documents\\Firmas\\FIEL_MET920131CN5_20200921113405\\met920131cn5.cer");
		    
			 //File file = new File("C:\\Users\\Usuario\\Documents\\OmarCodigo_29_Nov_21\\CSD_MET920131CN5_20211025100335\\CSD_METALSA_MET920131CN5_20211025_100315.key");
		File file = new File("C:\\Users\\Usuario\\Documents\\Firmas\\FIEL_GPR880111PA8_20181004_152208\\Claveprivada_FIEL_GPR880111PA8_20181004_152208.key");
		   
			 
		    String base64File = "";
	        //File file = new File(filePath);
	        try  {
	        	FileInputStream imageInFile = new FileInputStream(file);
	            // Reading a file from file system
	            byte fileData[] = new byte[(int) file.length()];
	            imageInFile.read(fileData);
	            base64File = Base64.encode(fileData);
	        } catch (FileNotFoundException e) {
	            System.out.println("File not found" + e);
	        } catch (IOException ioe) {
	            System.out.println("Exception while reading the file " + ioe);
	        }
	       
	        System.out.println("Hola");
	        System.out.println(base64File.toString());
		    
	        return base64File;
		    
		}
	
	
	public static void encodeTest() {
		String encodedfile = null;
		File file = new File("C:\\Users\\Usuario\\Documents\\Firmas\\FIEL_MET920131CN5_20200921113405\\WSCFDICancelacion_v16.pdf");
		byte fileContent[] = new byte[(int) file.length()];
		FileInputStream fin;
		// Read image in byte array
		try {
			fin = new FileInputStream(file);
			fin.read(fileContent);
			
			//encodedfile = Base64.encode(fin).toString();
			System.out.println(encodedfile);
		}catch(Exception e) {
			System.out.println(e);
		}
			
	}
	
}
//		// TODO Auto-generated method stub
//		
//		EspecOrdEncaFacElecTxtDTO espeEncaFacElecTxt = new EspecOrdEncaFacElecTxtDTO();
//		EspecOrdLineImpuestoCfdTxtDTO especOrdLineImpuestoCfdTxt = new EspecOrdLineImpuestoCfdTxtDTO();
//		EspecOrdLineDetCfdTxtDTO especOrdLineDetCfdTxt = new EspecOrdLineDetCfdTxtDTO();
//		
//		  
//		  FileWriter flwriter = null;
//			try {
//				//crea el flujo para escribir en el archivo
//				flwriter = new FileWriter("C:\\Users\\miguel.velazquez\\Documents\\ArchivosTxt\\Factura.txt");
//				//crea un buffer o flujo intermedio antes de escribir directamente en el archivo
//				BufferedWriter bfwriter = new BufferedWriter(flwriter);
//				
//				StringBuilder getFacturaFinal = new StringBuilder();
//				getFacturaFinal.append(GeneraStringFacturas.facturaCabecera(espeEncaFacElecTxt).toString());
//				getFacturaFinal.append(Constantes.SALTO_LINEA);
//				getFacturaFinal.append(Constantes.SIG_NEG);
//				getFacturaFinal.append(GeneraStringComplemento.facturaComplemento(especOrdLineDetCfdTxt).toString());
//				getFacturaFinal.append(Constantes.SALTO_LINEA);
//				getFacturaFinal.append(GeneraStringComplemento.facturaComplemento(especOrdLineDetCfdTxt).toString());
//				getFacturaFinal.append(Constantes.SALTO_LINEA);
//				getFacturaFinal.append(Constantes.SIG_NEG);
//				getFacturaFinal.append(GenerarStringImpuesto.facturaImpuesto(especOrdLineImpuestoCfdTxt).toString());
//				
//				bfwriter.write(getFacturaFinal.toString());
//				
//				//cierra el buffer intermedio
//				bfwriter.close();
//				System.out.println("Archivo creado satisfactoriamente..");
//	 
//			} catch (IOException e) {
//				e.printStackTrace();
//			} finally {
//				if (flwriter != null) {
//					try {//cierra el flujo principal
//						flwriter.close();
//					} catch (IOException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//			
//			
//		
//
//	}
//	
//	public static void testXml2JSON() throws Exception
//	{
//		String xmlEntrada = "<?xml version=\"1.0\" encoding=\"utf-8\"?><Error><ErrorCode>I0001</ErrorCode><ErrorMessage>El usuario, la contraseña y el documento XML son requeridos.</ErrorMessage><ErrorDateTime>2021-08-18 03:32:48</ErrorDateTime></Error>";
//	        try {
//	        	
//	        	String response = xmlStringToJSONString(xmlEntrada, 4);
//        		System.out.println(response);
//        		
//        		JSONObject jsonOb = new JSONObject(response);
//    			JSONArray arrJson=jsonOb.getJSONArray("Error");
//
//    			for(int i=0;i<arrJson.length();i++)
//    			System.out.println(arrJson.getString(i));
//    			
//        		
//        		
//        	} catch (JSONException je) {
//            	System.out.println(je.toString());
//        	}
//	}
//	
//	public static String xmlStringToJSONString(String xmlString, int indentFactor) {
//		JSONObject xmlJSONObj = XML.toJSONObject(xmlString);
//		String string = xmlJSONObj.toString(indentFactor);
//		return string;
//	}
//	
//	
//
//	/*	
//		try {
//			
//			String xmlEntrada = "<?xml version=\"1.0\" encoding=\"utf-8\"?><Error><ErrorCode>I0001</ErrorCode><ErrorMessage>El usuario, la contraseña y el documento XML son requeridos.</ErrorMessage><ErrorDateTime>2021-08-18 03:32:48</ErrorDateTime></Error>";
//			   
//			
//			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
//			InputSource src = new InputSource();
//			src.setCharacterStream(new StringReader(xmlEntrada));
//
//			Document doc = builder.parse(src);
//			String age = doc.getElementsByTagName("ErrorCode").item(0).getTextContent();
//			//String name = doc.getElementsByTagName("name").item(0).getTextContent();
//			
//			System.out.println("valor  "+age);
//			
////			WSCFDBuilderPlusSoap wSCFDBuilderPlusSoap = new WSCFDBuilderPlus().getWSCFDBuilderPlusSoap();
////			ReceiveCFDResponse response = new ReceiveCFDResponse();
////			
////			response.setReceiveCFDResult(wSCFDBuilderPlusSoap.receiveCFD("ekomercio","aserri",""));
////					
////				
////			System.out.println("Error "+response.getReceiveCFDResult());
////			
////			
////			
//			}catch(Exception e ) {
//			System.out.println("Error "+e);
//		}
//		
//		*/
//
//}
