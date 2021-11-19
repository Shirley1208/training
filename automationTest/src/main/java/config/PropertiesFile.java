package config;

import ebay.Ebay;

import java.io.*;
import java.util.Properties;

public class PropertiesFile {
    //Create an object of class Properties class
    static Properties prop = new Properties();

    public static void main(String[] args) {
        readPropertiesFile();
        writePropertiesFile();
//        readPropertiesFile();
    }

    public static void readPropertiesFile() {
        try {
            //Create an object of class InputStream
            InputStream input = new FileInputStream("/Users/shirley/IdeaProjects/automationTest/src/main/java/config/config.properties");
            //Load Properties file
            prop.load(input);
            //Get values from Properties file
            Ebay.browser = prop.getProperty("browser");
            System.out.println(Ebay.browser);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writePropertiesFile() {
        try {
            //Create an object of class OutputStream
            OutputStream output = new FileOutputStream("/Users/shirley/IdeaProjects/automationTest/src/main/java/config/config.properties");
            //Set values
            prop.setProperty("browser","Chrome");
            //Store values in properties file
            prop.store(output,null);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

