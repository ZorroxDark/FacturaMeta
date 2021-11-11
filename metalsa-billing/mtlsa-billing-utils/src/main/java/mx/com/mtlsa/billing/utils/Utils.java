package mx.com.mtlsa.billing.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
	
	
	
	public static String generaIdTxt() {
		
		 Date dNow = new Date();
	     SimpleDateFormat ft = new SimpleDateFormat("yyMMddhhmmss");
	     String datetime = ft.format(dNow);
	     
	     return datetime;
	}
	
	
	public static String getRutaGuardaTxt() {
		   
		   String ruta="";
		   
		   final File f = new File(Utils.class.getProtectionDomain().getCodeSource().getLocation().getPath());
		   try {
		       ruta= f.getCanonicalPath();
		       
		       String[] arrOfStr = ruta.split(Constantes.NOMBRE_DEL_MODULO_UTILS); 
		       ruta=arrOfStr[0]+Constantes.SPLIT_PARA_LA_RUTA;
		       
		       
		   } catch (IOException e) {
		      // TODO Auto-generated catch block
		      e.printStackTrace();
		      ruta="";
		   }
		   
		   
		   return ruta;
		}

}
