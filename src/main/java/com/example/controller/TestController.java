package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Controller
public class TestController {
    private static final Logger logger = LogManager.getLogger(TestController.class);
    @RequestMapping( value = "/hello")
    public String hello(Model model) {
    logger.info("Call /test");
//    logger.error("Call /test");
//    logger.debug("Call /test");
    return "hello";
    }
}
