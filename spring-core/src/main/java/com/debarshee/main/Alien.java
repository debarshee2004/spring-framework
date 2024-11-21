package com.debarshee.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

/*  Autowiring is a feature in Spring that allows the framework to automatically inject dependencies into beans.
    This eliminates the need to explicitly specify the dependencies in the configuration file. */
    @Autowired
    Planet planetObject;

    public void information() {
        System.out.println("Hello, this is an Alien from a planet far away.");

        planetObject.information();
    }
}
