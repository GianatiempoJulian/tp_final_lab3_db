package model;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonObject {
	
	public static JSONObject devolverJSON() {
		
        JSONObject objeto = new JSONObject();
        int codigoAdministrador = 1984;
        
        try {
        	
            JSONObject codigObject = new JSONObject();

        	
            JSONArray creadoresArray = new JSONArray();

            codigObject.put("Codigo Administrador", codigoAdministrador);
            
        
  

            JSONObject creadoresJsonObject1 = new JSONObject();
            creadoresJsonObject1.put("Nombre", "Federico Soler");
            JSONObject creadoresJsonObject2 = new JSONObject();
            creadoresJsonObject2.put("Nombre", "Ivan Metraillier");
            JSONObject creadoresJsonObject3 = new JSONObject();
            creadoresJsonObject3.put("Nombre", "Julian Gianatiempo");

            creadoresArray.put(creadoresJsonObject1);
            creadoresArray.put(creadoresJsonObject2);
            creadoresArray.put(creadoresJsonObject3);
            
            objeto.put("Codigo Administrador", codigObject);
            objeto.put("Creadores",creadoresArray);

        } catch (Exception e) {
        }




        return objeto;
    }
	
	public static void JSONtoJava (String json) {
        try {
        	
            JSONObject jsonObject = new JSONObject(json);
        	
             System.out.println(jsonObject.get("Codigo Administrador"));	
            
             JSONObject creadJsonObject ;
         
             JSONArray creadoresArray = jsonObject.getJSONArray("Creadores");
        
             for (int i = 0; i< creadoresArray.length();i++) {
            
            	 creadJsonObject = creadoresArray.getJSONObject(i);
                 System.out.println(creadJsonObject.getString("Nombre"));

             }

        } catch (Exception e) {
        	e.printStackTrace();

        }
    }

	
}
