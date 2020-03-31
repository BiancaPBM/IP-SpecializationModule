import javax.print.Doc;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Patient extends User {
    private List<String> symptoms = new ArrayList<>();
    private List<String> allergies = new ArrayList<String>();

    public Patient() {

    }

    public void setAllergies(List<String> allergies) {
        this.allergies = allergies;
    }

    public void setSymptoms(List<String> symptoms) {
        this.symptoms = symptoms;
    }

    public List<String> getAllergies() {
        return allergies;
    }

    public List<String> getSymptoms() {
        return symptoms;
    }

    public List<Doctor> searchDoctor(List<Doctor> doctorsList, String name) {
        List<Doctor> matchedDoctors = new ArrayList<>();
        for (Doctor doctor : doctorsList) {
            if (doctor.getName().contains(name)) {
                matchedDoctors.add(doctor);
            }
        }
        return matchedDoctors;
    }

    /*public boolean sendMessage(User user, String message) {

    }*/

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
