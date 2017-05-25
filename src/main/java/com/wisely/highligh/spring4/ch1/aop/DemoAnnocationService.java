package com.wisely.highligh.spring4.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * Created by kelvin on 17/5/22.
 */
@Service
public class DemoAnnocationService {

    @Action(name="注解式拦截的add操作")
    public void add(){

    }
}
