package com.BridgeLab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {

        ArrayList<Contacts> contactDetails = new ArrayList<>();
        static Scanner sc = new Scanner(System.in);
        static HashMap<String, ArrayList<Contacts>> hashmap = new HashMap<>();

        public static void main(String[] args) {
            AddressBookMain addContact=new AddressBookMain();
            addContact.createAddressBook();
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

            //to add multiple contact in the arraylist
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

        /***
         *Method to create the multiple AddressBook
         */
        public void createAddressBook() {

            while (true) {
                System.out.println("Choose what you want to do: ");
                System.out.println(
                        "1.Create new address book.\n2.Edit existing address book.\n3.Display all address books.\n4.exit");
                int choose = sc.nextInt();

                if (choose == 4) {
                    System.out.println("Exited");
                    break;
                }

                switch (choose) {
                    case 1:
                        System.out.println("Enter the name of address book: ");
                        String address_name = sc.next();

                        // condition to check for uniqueness of address book.
                        if (hashmap.containsKey(address_name)) {
                            System.out.println("Adress book name exits, enter different name");
                            break;
                        }

                        ArrayList<Contacts> new_address_book = new ArrayList<>();
                        Book = new_address_book;
                        while (true) {
                            int choose1;
                            System.out.println("Choose what you want to do: ");
                            System.out.println("1.Add details.\n2.Edit details.\n3.Delete contact.\n4.Exit");
                            choose1 = sc.nextInt();
                            if (choose1 == 4) {
                                System.out.println("Exited");
                                break;
                            }
                            switch (choose1) {
                                case 1:
                                    Details.AddDetails();
                                    break;
                                case 2:
                                    Details.editDetails();
                                    break;
                                case 3:
                                    Details.deleteDetails();
                                    break;
                                default:
                                    System.out.println("Choose valid option");
                                    break;
                            }
                            hashmap.put(address_name, Book);
                            System.out.println(hashmap);
                        }
                        break;

                    case 2:
                        System.out.println("Enter the name of address book: ");
                        String address_name_old = sc.next();

                        // condition to check whether address book exists or no.
                        if (hashmap.containsKey(address_name_old)) {

                            ArrayList<Contacts> old_address_book = new ArrayList<>();
                            Book = old_address_book;
                            Book = hashmap.get(address_name_old);
                            while (true) {
                                System.out.println("Choose what you want to do: ");
                                System.out.println("1.Add details.\n2.Edit details.\n3.Delete contact.\n4.Exit");
                                int choose2 = sc.nextInt();
                                if (choose2 == 4) {
                                    System.out.println("Exited");
                                    break;
                                }
                                switch (choose2) {
                                    case 1:
                                        Details.AddDetails();
                                        break;
                                    case 2:
                                        Details.editDetails();
                                        break;
                                    case 3:
                                        Details.deleteDetails();
                                        break;
                                    default:
                                        System.out.println("Choose valid option");
                                        break;
                                }
                                hashmap.put(address_name_old, Book);
                                System.out.println(hashmap);
                            }
                        } else {
                            System.out.println("Enter valid address book name");
                        }
                        break;

                    case 3:
                        System.out.println(hashmap);
                        break;

                    default:
                        System.out.println("Enter valid option");

                }
            }
        }


}
