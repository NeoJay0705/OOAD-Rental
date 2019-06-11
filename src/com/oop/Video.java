package com.oop;

public class Video {
    private String name;
    private VideoCategory category;
    private int pricePerDay;

    public Video(String name, String category) {
        this.name = name;
        switch(category) {
            case "New Release":
                this.category = new NewRelease();
                break;
            case "Drama":
                this.category = new Drama();
                break;
            case "Comedy":
                this.category = new Comedy();
                break;
            case "Romance":
                this.category = new Romance();
                break;
            case "Horror":
                this.category = new Horror();
                break;
            default:
                System.out.println("The category do not exist!");
        }
        this.pricePerDay = this.category.preicePerDay;
    }

    public String getName() {
        return this.name;
    }
}
