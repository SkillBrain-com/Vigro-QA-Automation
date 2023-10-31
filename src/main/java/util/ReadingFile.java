package util;

import java.io.*;
import java.util.Properties;

public final class ReadingFile {
    public static Properties file() throws IOException {
        Properties properties = new Properties();
        properties.load(fileReader("src/test/resources/properties/config.properties"));
        return properties;
    }

    public static FileReader fileReader(String path) throws FileNotFoundException {
        return new FileReader(path);
    }

    public static Reader reader(String path) throws FileNotFoundException {
        return new BufferedReader(new FileReader(path));
    }
}
