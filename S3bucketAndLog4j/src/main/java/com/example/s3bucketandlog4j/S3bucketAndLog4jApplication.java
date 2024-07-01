package com.example.s3bucketandlog4j;

import com.example.s3bucketandlog4j.Controller.LogController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S3bucketAndLog4jApplication {

    private static final Logger log = LogManager.getLogger(S3bucketAndLog4jApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(S3bucketAndLog4jApplication.class, args);
        processData();
        LogController logController = new LogController();
        logController.index();
    }

    public static void processData(){
        log.trace("TRACE Message");
        log.debug("DEGUR Message");
        log.info("Info Message ");
        log.warn("WARN Message");
        log.error("ERROR Message");
        log.fatal("FATAL Message");
    }

}
