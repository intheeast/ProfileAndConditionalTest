package com.intheeast.springframe.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigForConditional {

    @Bean
    @Conditional(CustomCondition.class)
    public MyService myService() {
        return new MyServiceImpl();
    }
}