package mx.com.mtlsa.billing.utils;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.Gson;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 String jsonString = "{ \"name\" : \"John\", \"age\" : \"20\", \"address\" : \"some address\" }";
//		 JSONObject jsonObject = new JSONObject(jsonString);
//		 JSONObject errorJson = jsonObject.getJSONArray("errors").getJSONObject(errorIndex);
//         String value = errorJson.getJSONArray("fields").getString(fieldIndex);
         
         String jsonString = "{\"solicitudCancelacion\""
         		+ ":[{\"cfdiuuid\":\"755CCA68-52EB-4DD1-BAA7-D672E2D5D6D3\",\"rfcEmisor\":\"MET920131CN5   \","
         		+ "\"rfcReceptor\":\"XEXX010101000\",\"montoTotal\":\"0.00\",\"tipoDoc\":\"0\",\"motivo\":\"02\"}]}";
         
         
         JSONObject jsonObject = new JSONObject(jsonString);
         JSONArray age = jsonObject.getJSONArray("solicitudCancelacion");
         System.out.println(age.get(0).toString());
         
         Gson gson = new Gson();
         SolCancelacionRequest nameList =  gson.fromJson(age.get(0).toString(), SolCancelacionRequest.class);
         
         System.out.println(nameList.getCfdiuuid());
         
        // GetObject studentList = age.readValue(jsonString, GetObject.class);
         //System.out.println(age.getJSONArray("cfdiuuid").getString("cfdiuuid"));

	}

}
