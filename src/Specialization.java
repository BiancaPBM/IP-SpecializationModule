import java.util.List;

public class Specialization {
    private String name;
    private String description;
    private List<Doctor> doctorList;

    public Specialization() {
    }

    public Specialization(String name,String description) {
        this.name = name;
        this.description = description;
    }

    public boolean addDoctor(Doctor doctor){
       doctorList.add(doctor);
       return true;
    }

    public boolean removeDoctor(Doctor doctor){
        doctorList.remove(doctor);
        return true;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(List<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
}
