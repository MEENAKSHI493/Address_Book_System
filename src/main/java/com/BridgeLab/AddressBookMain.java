package com.BridgeLab;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

        public static void main(String[] args) {
            System.out.println("Welcome to Address Book System");
            System.out.println("*******************************");
            AddressBookMain addContact=new AddressBookMain();
            addContact.addContactDetails();
        }

        /***
         *Method to add the new contacts
         */
        public void addContactDetails() {

            Contacts details = new Contacts();//Object of Contacts
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the First Name of person:");
            details.setFirstname(sc.next());
            System.out.println("Enter the Last Name of person:");
            details.setLastname(sc.next());
            System.out.println("Enter the Address Name of person:");
            details.setAddress(sc.next());
            System.out.println("Enter the City Name of person:");
            details.setCity(sc.next());
            System.out.println("Enter the State Name of person:");
            details.setState(sc.next());
            System.out.println("Enter the Email of person:");
            details.setEmail(sc.next());
            System.out.println("Enter the Zip code of person:");
            details.setZip(sc.nextInt());
            System.out.println("Enter the Phone number of person:");
            details.setPhoneNumber(sc.nextInt());
            sc.close();
            System.out.println("*******************************");
            System.out.println(details.toString());
        }
}
