package com.wisely.highligh.spring4.ch1.javaconfig;

import org.springframework.stereotype.Service;

/**
 * Created by kelvin on 17/5/19.
 */
@Service
public class UseFunctionService {
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String SayHello(String word){
        return functionService.sayHello(word);
    }

}
