package com.wisely.highligh.spring4.ch1.aop;

import java.lang.annotation.*;

/**
 * Created by kelvin on 17/5/22.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}