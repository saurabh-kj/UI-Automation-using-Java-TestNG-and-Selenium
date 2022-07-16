package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
    private static ReadConfig conf;
    private static Properties prop;

    private ReadConfig() {

    }

    public static ReadConfig getInstance(String str) throws IOException {
        if(conf==null){
            prop=new Properties();
            File file=new File(System.getProperty("user.dir")+"/config/"+str);
            if(file.exists()){
                FileInputStream fi=new FileInputStream(file);
                prop.load(fi);
                conf=new ReadConfig();
            }

        }
        return conf;
    }

    public String getBrowerName(){
        return prop.getProperty("browser");
    }

    public String getUrl(){
        return prop.getProperty("url");
    }

}
