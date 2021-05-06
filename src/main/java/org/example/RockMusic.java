package org.example;

import org.springframework.stereotype.Component;

@Component("rockMusic")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "We will rock you";
    }
}
