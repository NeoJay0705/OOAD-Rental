package com.oop;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Rental {
    private int rent;
    private int restVideoAmount;
    private List<Video> rentableList;
    private List<Record> completeRentalList;
    private List<Record> activeRentalList;
    private List<Customer> customerList;

    public Rental(List<Video> listVideo){
        this.rentableList = listVideo;
        this.rent = 0;
        this.restVideoAmount = listVideo.size();
        this.completeRentalList = new ArrayList<Record>();
        this.activeRentalList = new ArrayList<Record>();
        this.customerList = new ArrayList<Customer>();
    }

    public List<Customer> getCustomerList() {
        return this.customerList;
    }

    public int getRestVideoAmount() {
        return this.restVideoAmount;
    }

    public int getRent() {
        return this.rent;
    }

    public List<Record> getCompleteRentalList() {
        return this.completeRentalList;
    }

    public List<Record> getActiveRentalList() {
        return this.activeRentalList;
    }

    public void checkoutProduct(Customer customer) {
        for(int i = 0; i < this.rentableList.size(); i++){
            boolean flagBuy = customer.buyVideo(this.rentableList.get(i));
            if(flagBuy == true) {
                this.customerList.add(customer);
                this.activeRentalList.add(new Record(customer, rentableList.get(i)));
                this.restVideoAmount--;
                this.rentableList.remove(rentableList.get(i));
                i--;
            }
        }
    }

    public void returnProduct(Customer customer) {
        for(int i = 0; i < customer.getRentedList().size(); i++) {
            this.customerList.remove((customer));
            this.rentableList.add(customer.getRentedList().get(i));
            this.restVideoAmount++;
            for(int i1 = 0; i1 < this.activeRentalList.size(); i1++) {
                if(this.activeRentalList.get(i1).getVideoName() == customer.getRentedList().get(i).getName()) {
                    this.activeRentalList.remove(this.activeRentalList.get(i1));
                    i1--;
                }
            }
            this.completeRentalList.add(new Record(customer, customer.getRentedList().get(i)));
        }
    }
}

