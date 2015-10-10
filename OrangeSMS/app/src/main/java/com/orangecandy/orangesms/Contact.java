package com.orangecandy.orangesms;

public class Contact {
    private String name, phoneNo;

    public Contact(){

    };

    public Contact(String name, String phoneNo){
        this.name = name;
        this.phoneNo = phoneNo;
    };

    public String getName() {
      return name;
    };

    public String getPhoneNo() {
        return phoneNo;
    };

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contact other = (Contact) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if (this.phoneNo != other.phoneNo) {
            return false;
        }
        return true;
    }
}
