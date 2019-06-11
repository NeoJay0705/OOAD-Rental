package com.oop;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Factory {

    public static List<Customer> createCustomers(int amount) {
        Random random = new Random();
        List<Customer> listCustomer = new ArrayList<Customer>();
        for(int i = 1; i <= amount; i++){
            listCustomer.add(new Customer(Integer.toString(random.nextInt()), random.nextInt(3) + 1));
        }
        return listCustomer;
    }

    public static List<Video> createVideo() {
        List<Video> listVideo = new ArrayList<Video>();
        listVideo.add(new Video("A", "New Release"));
        listVideo.add(new Video("B", "New Release"));
        listVideo.add(new Video("C", "New Release"));
        listVideo.add(new Video("D", "New Release"));
        listVideo.add(new Video("E", "Drama"));
        listVideo.add(new Video("F", "Drama"));
        listVideo.add(new Video("G", "Drama"));
        listVideo.add(new Video("H", "Drama"));
        listVideo.add(new Video("I", "Comedy"));
        listVideo.add(new Video("J", "Comedy"));
        listVideo.add(new Video("K", "Comedy"));
        listVideo.add(new Video("L", "Comedy"));
        listVideo.add(new Video("M", "Romance"));
        listVideo.add(new Video("N", "Romance"));
        listVideo.add(new Video("O", "Romance"));
        listVideo.add(new Video("P", "Romance"));
        listVideo.add(new Video("Q", "Horror"));
        listVideo.add(new Video("R", "Horror"));
        listVideo.add(new Video("S", "Horror"));
        listVideo.add(new Video("T", "Horror"));
        return listVideo;
    }
}
