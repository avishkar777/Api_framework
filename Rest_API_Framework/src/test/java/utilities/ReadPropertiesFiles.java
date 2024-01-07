package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFiles {

    static Properties prop=null;
    public static void readPropertyFile(){
        FileInputStream fs= null;
        try {
            fs = new FileInputStream("/info.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        prop=new Properties();
        try {
            prop.load(fs);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getProperty(String key){
        readPropertyFile();
        return prop.getProperty(key);
    }
}
