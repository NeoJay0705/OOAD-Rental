package com.oop;

import java.util.List;
import java.util.ArrayList;

public class Record {
    private Video video;
    private Customer customer;

    public Record(Customer customer, Video video) {
        this.video = video;
        this.customer = customer;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public String getCustomerName() {
        return this.customer.getName();
    }

    public String getVideoName() {
        return this.video.getName();
    }

    public String getRentTerm() {
        return Integer.toString(this.customer.getRentDay());
    }
}
