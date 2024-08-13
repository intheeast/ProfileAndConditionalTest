package com.intheeast.springframe.ioc;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAppForProfile {
	public static void main(String[] args) {
        // 프로파일 설정: "dev" 또는 "prod"
        System.setProperty("spring.profiles.active", "prod");

        ApplicationContext ctx = 
        		new AnnotationConfigApplicationContext(AppConfigForProfile.class);

        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println("Using DataSource: " + dataSource.getClass().getName());
    }
}
