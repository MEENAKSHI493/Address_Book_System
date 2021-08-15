package com.BridgeLab;
/**
 * @author Meenakshi-Create Contacts to address book system
 */
    public class Contacts {

        /**
         * Contacts related variable declaration
         */
        private String firstname;
        private String lastname;
        private String address;
        private String city;
        private String state;
        private String email;
        private int zip;
        private int phonenumber;

        /**
         * Getter setter methods to assign/retrieve the contact details
         * @return
         */
        public String getFirstname() {
                return this.firstname = firstname;
            }

        public void setFirstname(String firstname) {
            this.firstname=firstname;
        }

        public String getLastname() {
            return this.lastname = lastname;
        }

        public void setLastname(String lastname) {
            this.lastname=lastname;
        }

        public String getAddress() {
            return this.address = address;
        }

        public void setAddress(String address) {
             this.address = address;
        }

        public String getCity() {
            return this.city = city;
        }

        public void setCity(String city) {
             this.city = city;
        }

        public String getState() {
              return this.state = state;
            }

        public void setState(String state) {
             this.state = state;
        }

        public String getEmail() {
            return this.email = email;
        }

        public void setEmail(String email) {
             this.email = email;
        }

        public int getZip() {
            return this.zip = zip;
        }

        public void setZip(int zip) {
             this.zip = zip;
        }

        public int getNumber() {
            return this.phonenumber = phonenumber;
        }

        public void getNumber(int phonenumber) {
             this.phonenumber = phonenumber;
        }

    }
