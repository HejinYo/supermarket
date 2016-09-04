package com.hello;

import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("helloChina")
public class HelloChina implements IHelloMessage {
    @Override
    public void printMessage(String message) {
        System.out.println("我是"+ message + this.hashCode());
    }
}
