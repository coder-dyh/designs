package edu.charge.utils;

import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

    private static Properties prop = new Properties();

    static {
        //从classpath中获取输入流，然后读取properties文件
        try {
            prop.load(Thread.currentThread().getContextClassLoader()
                    .getResourceAsStream("charge.properties"));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("File not found.", e);
        }
    }

    /**
     * 根据key获取value
     *
     */
    public static String getProperty(String key){
        return prop.getProperty(key);
    }
}
