package com.demo.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.demo.spring")
@ComponentScan("com.demo.spring.entity")
public class AppConfig {

}
