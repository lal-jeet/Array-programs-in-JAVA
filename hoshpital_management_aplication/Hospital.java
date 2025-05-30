package com.hoshpital_management_aplication;
import java.util.List;

public class Hospital {
    private static int hospitalCodeCounter = 100; // Static counter for hospital codes
    private int hospitalCode;
    private String hospitalName;
    private List<String> listOfTreatments;
    private String contactPerson;
    private String contactNumber;
    private String location;

   
    public Hospital(String hospitalName, List<String> listOfTreatments, 
                    String contactPerson, String contactNumber, String location) {
        this.hospitalCode = hospitalCodeCounter++;
        this.hospitalName = hospitalName;
        this.listOfTreatments = listOfTreatments;
        this.contactPerson = contactPerson;
        this.contactNumber = contactNumber;
        this.location = location;
    }

    
    public int getHospitalCode() {
        return hospitalCode;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public List<String> getListOfTreatments() {
        return listOfTreatments;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void setListOfTreatments(List<String> listOfTreatments) {
        this.listOfTreatments = listOfTreatments;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Hospital [hospitalCode=" + hospitalCode + 
               ", hospitalName=" + hospitalName + 
               ", listOfTreatments=" + listOfTreatments + 
               ", contactPerson=" + contactPerson + 
               ", contactNumber=" + contactNumber + 
               ", location=" + location + "]";
    }
}
