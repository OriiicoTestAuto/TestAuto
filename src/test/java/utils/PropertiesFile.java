package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

//Classe qui va permettre de lire le fichier config.properties
public class PropertiesFile {
    static HashMap<String, String> propertiesMap = new HashMap<>();

    // Retourner une clé ainsi que sa valeur du fichier config.properties
    public static HashMap<String, String> read(String propertiesFilePath){
        File file = new File(propertiesFilePath);
        //Récupérer le fichier pour pouvoir le lire
        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Récupérer infos (clé, valeur) pour intégrer dans fichier
        Properties properties = new Properties();
        try {
            assert fileInput != null;
            properties.load(fileInput);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Récupérer les clés dans properties et mapper dans la liste keys
        Enumeration keys = properties.keys();
        while (keys.hasMoreElements()){
            String key = (String) keys.nextElement();
            String value = properties.getProperty(key);
            propertiesMap.put(key,value);
        }
        return propertiesMap;
    }

}//END.

