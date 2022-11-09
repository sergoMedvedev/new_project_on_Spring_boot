package com.SpringBoot;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.SpringBoot")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
