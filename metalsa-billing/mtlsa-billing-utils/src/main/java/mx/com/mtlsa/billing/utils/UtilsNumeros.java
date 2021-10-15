package mx.com.mtlsa.billing.utils;

public class UtilsNumeros {

	public static String numDecimal2(String valor) {

		String respuesta = "";

		try {
			
			if(valor.trim().length()>0) {
				
				respuesta = String.format("%.2f", Float.valueOf(valor));
				
			}
			

		} catch (Exception e) {

			System.out.println("Ocurrio un error en: UtilsNumeros numDecimal2 " + e);
			respuesta = "";
		}
		return respuesta;

	}

	public static String valStrToInt(String valor) {

		String respuesta = "";
		try {
			
			if(isNumeric(valor.trim())) {
				//Integer.valueOf(valor.toString().trim());
				respuesta = valor.trim();
			}
		} catch (Exception e) {
			System.out.println("Ocurrio un error en: UtilsNumeros stringToInteger " + e);
			respuesta = "";
		}
		return respuesta;
	}
	
	
	public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }

}
