package com.oop;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Customer {
    private String name;
    private CustomerType type;
    private int rentAmount;
    private List<Video> rentedList;
    private int rentedTime;

    public static final int maxRentedAmount = 7;
    public static final int maxRentedDay = 3;

    public Customer(String name, int type) {
        this.rentAmount = 0;
        this.setName(name);
        this.rentedTime = 0;
        this.rentedList = new ArrayList<Video>();
        switch (type) {
            case 1:
                this.type = new Breezy();
                break;
            case 2:
                this.type = new Hoaders();
                break;
            case 3:
                this.type = new Regular();
                break;
            default:
                System.out.println("Type error");
        }
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public List<Video> getRentedList() {
        return this.rentedList;
    }

    public int getRentAmount() {
        return this.rentAmount;
    }

    public boolean buyVideo(Video video) {
        Random random = new Random();
        if(random.nextInt(4) == 0) {
            this.rentAmount++;
            this.rentedList.add(video);
            return true;
        }
        else {
            return false;
        }
    }

    public void returnVideo(Video video) {

    }

    public int getRentDay() {
        return this.type.getRentDay();
    }

    public int getRentedTime() {
        return this.rentedTime;
    }

    public void setRentedTime() {
        this.rentedTime++;
    }
}
