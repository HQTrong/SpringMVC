package com.example.controller;

import com.example.util.Log4j;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.xml.DOMConfigurator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.apache.log4j.MDC;

import java.io.IOException;


@Controller
public class TestController {
    Logger logger = Logger.getLogger(TestController.class);
    //Log4j log4j = new Log4j();
    @RequestMapping( value = "/hello")
    public String hello(Model model) {
        //String projectPath = log4j.getPath();

//        try {
//            FileAppender fileAppender = new FileAppender(new PatternLayout("%d %-5p [%c{1}] %m%n"),
//                    projectPath + "/Log.log");
//            logger.addAppender(fileAppender);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        Log4j.addFileAppender(logger);

        // Sử dụng Logger
        logger.info("This is a log message.");
        return "hello";
    }

}
