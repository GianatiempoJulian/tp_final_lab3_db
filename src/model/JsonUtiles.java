package model;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonUtiles {

private final static String nombreArchivo = "test.json";

    public static void grabar(JSONArray array) {
        try {
            FileWriter file = new FileWriter(nombreArchivo);
            file.write(array.toString());
            file.flush();
            file.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void grabar(JSONObject jsonObject,String archivo) {
        try {
            FileWriter file = new FileWriter(archivo);
            file.write(jsonObject.toString());
            file.flush();
            file.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    public static String leer(String archivo) 
    {
        String contenido = "";
        try 
        {
            contenido = new String(Files.readAllBytes(Paths.get(archivo)));
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        return contenido;
    }
    
    


}
