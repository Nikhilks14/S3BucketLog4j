package com.example.s3bucketandlog4j.Controller;

import org.apache.logging.log4j.LogManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import  org.apache.logging.log4j.Logger;


@RestController
public class LogController {

public static final Logger logger = LogManager.getLogger(LogController.class);


    @GetMapping("/")
    public String index() {
        logger.info("Controller");
        return "Hello log";
    }
}
