package com.oop;

import java.util.Random;

public class Regular extends CustomerType {

    public Regular() {
        Random random = new Random();
        this.rentAmount = random.nextInt(3) + 1;
        this.rentDay =  random.nextInt(3) + 3;
    }
}
