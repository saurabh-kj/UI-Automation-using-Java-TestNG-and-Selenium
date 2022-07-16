package utils;

import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;

public class YamlReader {

    private static YamlReader reader;

    private  YamlReader(){
    }

    public static YamlReader getInstance() throws FileNotFoundException {
        if(reader==null){
        }
        synchronized (YamlReader.class) {
            if (null == reader) {
                reader = new YamlReader();
            }
        }
        return reader;
    }

    public HashMap<String,String> getDetails(String name) throws FileNotFoundException {
        InputStream inputStream = new FileInputStream(new File(System.getProperty("user.dir") + "/src/test/resources/testdata/TestData.yml"));

        Yaml yaml = new Yaml();
        HashMap<String, Object> data = yaml.load(inputStream);

        return (HashMap<String, String>) data.get(name);
    }

}
