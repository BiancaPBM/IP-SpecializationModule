package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Doctor extends User{

    private List<Specialization> specializations; // = new ArrayList<>();
    private String workingHours ;
    private List<String> workingLocations; // = new ArrayList<>();

    public Doctor() {
        specializations = new ArrayList<>();
        workingLocations =  new ArrayList<>();
    }


    public List<Specialization> getSpecializations() {
        return specializations;
    }

    public void setSpecializations(List<Specialization> specializations) {
        this.specializations = specializations;
    }

    public List<String> getWorkingLocations() {
        return workingLocations;
    }

    public void setWorkingLocations(List<String> workingLocations) {
        this.workingLocations = workingLocations;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public boolean addSpecialization ( Specialization specialization) //////adaugare specializare doctor
    {
        specializations.add(specialization);
        return true;
    }
    public boolean addLocation ( String location)           // adaugare locatie lucru doctor
    {
        workingLocations.add(location);
        return true;
    }

    public String getField(String criteria, String criteriaValue)
    {
        if ("name".equals(criteria))
        {
            if(criteriaValue.equals(this.name)) return this.name;
            else return null;
        }
        else if("oras".equals(criteria))
        {
            if(criteriaValue.equals(this.town)) return this.town;
            else return null;
        }
        else if("workLocation".equals(criteria))
        {
            for(String s : workingLocations)
            {
                if(s.equals(criteriaValue)) return s;
            }
            return null;
        }
        else if("specialization".equals(criteria))
        {
            for(Specialization specialization : specializations)
            {
                if(specialization.getName().equals(criteriaValue)) return criteriaValue;
            }
            return null;
        }

        else return null;
    }

    public String  getName() {
        return this.name;
    }


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public List<Doctor> searchDoctor(List<Doctor> doctorsList, String name) {
        List<Doctor> matchedDoctors = new ArrayList<>();
        for (Doctor doctor : doctorsList) {
            if (doctor.getName().contains(name)) {
                matchedDoctors.add(doctor);
            }
        }
        return matchedDoctors;
    }

    public List<Doctor> sortDoctors(List<Doctor> doctorsList, Comparator<Doctor> comparator) {
        doctorsList.sort(comparator);
        return doctorsList;
    }



    public List<Specialization> searchSpecialization(List<Specialization> specializationList, String name) {
        List<Specialization> matchedSpecializations = new ArrayList<>();
        for (Specialization specialization : specializationList) {
            if (specialization.getName().contains(name)) {
                matchedSpecializations.add(specialization);
            }
        }
        return matchedSpecializations;
    }
    public List<Doctor> filterDoctors(List<Doctor> doctorList, String criteria, String criteriaValue) {
        List<Doctor> filteredDoctors = doctorList.stream().filter(doctor -> criteriaValue.equals(doctor.getField(criteria,criteriaValue))).collect(Collectors.toList());
        return filteredDoctors;
    }

}
