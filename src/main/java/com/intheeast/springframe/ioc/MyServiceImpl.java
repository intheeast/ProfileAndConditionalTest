package com.intheeast.springframe.ioc;

public class MyServiceImpl implements MyService {

    @Override
    public void performService() {
        System.out.println("Service is being performed.");
    }
}