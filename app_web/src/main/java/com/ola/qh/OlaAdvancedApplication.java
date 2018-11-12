package com.ola.qh;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/*import springfox.documentation.swagger2.annotations.EnableSwagger2;*/

@SpringBootApplication
@EnableScheduling
@EnableSwagger2
public class OlaAdvancedApplication
{
    public static void main(String[] args) throws IOException
    {
	SpringApplication.run(OlaAdvancedApplication.class, args);
    }
}
