package com.example.util;

import org.apache.log4j.FileAppender;
import org.apache.log4j.PatternLayout;

import java.io.IOException;
import java.net.URL;
import org.apache.log4j.Logger;
public class Log4j {
    public String getPath(){
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL resource = classLoader.getResource(".");
        String inputPath= resource.getPath();
        int targetIndex = inputPath.indexOf("/target/");
        String projectPath = inputPath.substring(0, targetIndex);
        return  projectPath;
    }
    public static void addFileAppender(Logger logger) {
        try {
            Log4j log4j = new Log4j();
            String projectPath= log4j.getPath();
            FileAppender fileAppender = new FileAppender(new PatternLayout("%d %-5p [%c{1}] %m%n"),
                    projectPath + "/Log.log");
            logger.addAppender(fileAppender);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
