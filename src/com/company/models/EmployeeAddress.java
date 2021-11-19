package com.company.models;

public class EmployeeAddress {
    private String AddressLine1;
    private String AddressLine2;
    private String PhoneNo;
    private String City;
    private String Country;

    public EmployeeAddress(String addressLine1, String addressLine2, String phoneNo, String city, String country) {
        AddressLine1 = addressLine1;
        AddressLine2 = addressLine2;
        PhoneNo = phoneNo;
        City = city;
        Country = country;
    }

    public String getAddressLine1() {
        return AddressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        AddressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return AddressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        AddressLine2 = addressLine2;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }
}
