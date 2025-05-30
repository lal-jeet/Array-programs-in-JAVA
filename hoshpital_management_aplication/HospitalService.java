package com.hoshpital_management_aplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HospitalService {
    private List<Hospital> hospitals = new ArrayList<>();
    public int addHospital(String hospitalName, List<String> listOfTreatments, 
                           String contactPerson, String contactNumber, String location) {
        Hospital hospital = new Hospital(hospitalName, listOfTreatments, 
                                          contactPerson, contactNumber, location);
        hospitals.add(hospital);
        return hospital.getHospitalCode();
    }
    public Map<Integer, String> getHospitals() {
        Map<Integer, String> hospitalMap = new HashMap<>();
        for (Hospital hospital : hospitals) {
            hospitalMap.put(hospital.getHospitalCode(), hospital.getHospitalName());
        }
        return hospitalMap;
    }
    public Hospital getHospitalDetails(int hospitalCode) {
        for (Hospital hospital : hospitals) {
            if (hospital.getHospitalCode() == hospitalCode) {
                return hospital;
            }
        }
        return null; // Return null if not found
    }
}
