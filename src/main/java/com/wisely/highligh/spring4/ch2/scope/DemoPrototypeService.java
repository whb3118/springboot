package com.wisely.highligh.spring4.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by kelvin on 17/5/22.
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {

}
