package com.hoshpital_management_aplication;

import java.util.Arrays;
public class HospitalTester {
    public static void main(String[] args) {
        HospitalService hospitalService = new HospitalService();
        
        // Adding hospitals
        
        int code1 = hospitalService.addHospital("YASHODA", 
            Arrays.asList("Cardiac", "ENT", "Ortho", "Pediatric", "Gastro"), 
            "MATHEWS", "9848222222", "Sec");
        
        int code2 = hospitalService.addHospital("MAX", 
            Arrays.asList("Cardiac", "Neuro"), 
            "JOHN", "9848222223", "North");
        
        // Displaying all hospitals
        
        System.out.println("Hospitals: " + hospitalService.getHospitals());
        
        // Getting details of a specific hospital
        
        Hospital hospitalDetails = hospitalService.getHospitalDetails(code1);
        if (hospitalDetails != null) {
            System.out.println("Details of Hospital Code " + code1 + ": " + hospitalDetails);
        } else {
            System.out.println("Hospital not found.");
        }
    }
}
