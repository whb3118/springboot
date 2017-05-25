package com.wisely.highligh.spring4.ch1.javaconfig;

import org.springframework.stereotype.Service;

/**
 * Created by kelvin on 17/5/19.
 */
@Service
public class FunctionService {
    public String sayHello(String word){
        return "Hello " + word +" !";
    }
}
