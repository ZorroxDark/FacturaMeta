package mx.com.mtlsa.billing.utils;

import java.io.File;

public class Test2 {

	public static void main(String[] args) {

	    String directorioRaiz = System.getProperty("user.dir");
	    System.out.println("Directorio de trabajo = " + directorioRaiz);

	    archivos(directorioRaiz);
	}

	public static void archivos(String directorioRaiz) {
	    File carpeta = new File(directorioRaiz);
	    if (carpeta.exists()) {
	        File[] ficheros = carpeta.listFiles(); //Listar archivos en carpeta raiz
	        for (File f : ficheros) {
	            System.out.println(f.getName());
	        }
	    } else {

	    }
	}
}
