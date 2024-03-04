package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader
{

    public static String getProperty(String key) throws IOException {

        Properties prop=new Properties();

            prop.load(new FileInputStream(new File("./ConfigFiles/Config.properties")));
        String value=prop.getProperty(key);

        return value;

    }



}
