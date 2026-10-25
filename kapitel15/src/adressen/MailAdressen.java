package adressen;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class MailAdressen {
    private Properties property = new Properties();


    public void hinzufuegen(String key, String value) {
        property.setProperty(key, value);
    }

    public String getAdresse(String key) {
        return property.getProperty(key);
    }

    public void laden(String dateinamen) throws java.io.IOException {
        FileInputStream in = new FileInputStream(dateinamen);
        property.load(in);
        in.close();
    }

    public void display(){
        Enumeration e = property.keys();

        while(e.hasMoreElements()) {
            String name = (String) e.nextElement();
            String adresse = property.getProperty(name);
            System.out.println(name + " " + adresse);
        }
    }
}
