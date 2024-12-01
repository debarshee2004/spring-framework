package com.debarshee.spring_boot_basics;

import org.springframework.stereotype.Component;

@Component
public class Planet {
    public void information() {
        System.out.println("I am from the planet Pluto from the Milky Way Galaxy.");
    }
}
