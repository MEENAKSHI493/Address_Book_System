package com.BridgeLab;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

        ArrayList<Contacts> contactDetails = new ArrayList<>();
        static Scanner sc = new Scanner(System.in);


        public static void main(String[] args) {
            int i=0;
            AddressBookMain addContact=new AddressBookMain();

            while (i == 0) {
                System.out.println("Do you would like to continue?: ");
                System.out.println("1.Add details.\n2.Edit details.\n3.Delete the details");
                int choose = sc.nextInt();
                switch (choose) {
                    case 1:
                        addContact.addContactDetails();
                        break;
                    case 2:
                        addContact.editContactDetails();
                        break;
                    case 3:
                        addContact.deleteContactDetails();
                        break;
                    default:
                        i = 1;
                        System.out.println("Wrong option");
                        addContact.addContactDetails();
                        break;
                }
            }


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
            //sc.close();
            contactDetails.add(details);
            System.out.println("*******************************");
            System.out.println(details.toString());
        }

        /***
         *Method to edit the contact details
         */
        public void editContactDetails() {

                System.out.println("Confirm your first name to edit details: ");
                String name = sc.next();

                for (int i = 0; i < contactDetails.size(); i++) {
                    if (contactDetails.get(i).getFirstname().equals(name)) {
                        System.out.println("Select form below to change: ");
                        System.out.println(
                                "\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Email\n7.Zip\n8.Phone number");
                        int e = sc.nextInt();

                        switch (e) {
                            case 1:
                                System.out.println("Enter first name");
                                contactDetails.get(i).setFirstname(sc.next());
                                break;
                            case 2:
                                System.out.println("Enter Last name");
                                contactDetails.get(i).setLastname(sc.next());
                                break;
                            case 3:
                                System.out.println("Enter address");
                                contactDetails.get(i).setAddress(sc.next());
                                break;
                            case 4:
                                System.out.println("Enter city");
                                contactDetails.get(i).setCity(sc.next());
                                break;
                            case 5:
                                System.out.println("Enter state");
                                contactDetails.get(i).setState(sc.next());
                                break;
                            case 6:
                                System.out.println("Enter email");
                                contactDetails.get(i).setEmail(sc.next());
                                break;
                            case 7:
                                System.out.println("Enter Zip");
                                contactDetails.get(i).setZip(sc.nextInt());
                                break;
                            case 8:
                                System.out.println("Enter phone number");
                                contactDetails.get(i).setPhoneNumber(sc.nextInt());
                                break;
                        }

                        System.out.println(contactDetails);

                    } else
                        System.out.println("Enter valid First name");
                }

            }
        /**
         * Purpose : Used deleteDetails method to delete the details of the person
         */
        public void deleteContactDetails() {

            System.out.println("Confirm your first name to edit details: ");
            String name = sc.next();

            for (int i = 0; i < contactDetails.size(); i++) {
                if (contactDetails.get(i).getFirstname().equals(name)) {
                    System.out.println("Select form below to change: ");
                    contactDetails.remove(i);
                }
            }
            System.out.println(contactDetails);
        }

}
