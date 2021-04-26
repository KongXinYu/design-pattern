package com.wzy.design.pattern.utils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInput;
import java.util.Properties;

/**
 * @description:
 * @author: WuZY
 * @time: 2021/4/26 0026
 */
public class PropertiesUtil {

    private static Properties properties = new Properties();

    public synchronized static void loadPropertis(String path) {
        try(
                InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(path);
                ) {
            properties.load(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }


}
