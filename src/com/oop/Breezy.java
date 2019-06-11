package com.oop;

import java.util.Random;

public class Breezy extends CustomerType {

    public Breezy(){
        Random random = new Random();
        this.rentAmount = random.nextInt(2) + 1;
        this.rentDay = random.nextInt(2) + 1;
    }
}
