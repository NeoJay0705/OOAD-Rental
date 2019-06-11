package com.oop;

import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int days = 35;
        List<Video> listVideo = Factory.createVideo();
        Rental store = new Rental(listVideo);
        Random random = new Random();

        for(int day = 1; day <= days; day++) {
            List<Customer> listCustomer = Factory.createCustomers(random.nextInt(4) + 1);
            // customer return
            for(int i = 0; i < store.getCustomerList().size(); i++) {
                store.getCustomerList().get(i).setRentedTime();
            }
            for(int i = 0; i < store.getActiveRentalList().size(); i++) {
                Customer customer =  store.getActiveRentalList().get(i).getCustomer();
                //customer.setRentedTime();
                if(customer.getRentedTime() == customer.getRentDay()) {
                    System.out.println(customer.getRentedTime());
                    System.out.println(customer.getRentDay());
                    System.out.println(customer.getName());
                    store.returnProduct(customer);
                    //i = i - (store.getActiveRentalList().get(i).getCustomer().getRentAmount();
                    i = -1;
                }
//                store.getActiveRentalList().get(i).getCustomer().setRentedTime();
//                if(store.getActiveRentalList().get(i).getCustomer().getRentedTime() == store.getActiveRentalList().get(i).getCustomer().getRentDay()) {
//                    store.returnProduct(store.getActiveRentalList().get(i).getCustomer());
//                    //i = i - (store.getActiveRentalList().get(i).getCustomer().getRentAmount();
//                    i = -1;
//                }

        }

            // customer rent
            for(int i = 0; i < listCustomer.size(); i++) {
                if (store.getRestVideoAmount() < 3) {
                    System.out.println("No Video");
                    break;
                }
                else {
                    store.checkoutProduct(listCustomer.get(i));
                    //listCustomer.get(i).setRentedTime();
                }
            }
            System.out.println("Day" + day + " active list");
            for(int i = 0; i < store.getActiveRentalList().size(); i++) {
                Record record = store.getActiveRentalList().get(i);
                System.out.println("Customer ID: " + record.getCustomerName() + "\tVideo Name: " + record.getVideoName() + "\tRented Term: " + record.getRentTerm());

            }
        }
        System.out.println("Complete list: ");
        for(int i = 0; i < store.getCompleteRentalList().size(); i++) {
            Record record = store.getCompleteRentalList().get(i);
            System.out.println("Customer ID: " + record.getCustomerName() + "\tVideo Name: " + record.getVideoName() + "\tRented Term: " + record.getRentTerm());
        }
    }
}
