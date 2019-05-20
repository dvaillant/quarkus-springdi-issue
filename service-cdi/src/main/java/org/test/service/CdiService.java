package org.test.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CdiService {

    public String sayHello(){
        return "Hello from CDI";
    }
}
