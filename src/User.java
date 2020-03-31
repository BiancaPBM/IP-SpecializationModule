import java.util.*;

public abstract class User {
    protected String name;
    protected int age;
    protected String address;
    protected String email;
    protected String telephone;
    //abstract boolean login();
    // abstract boolean sendMessage(User user, String message);
    abstract List<Doctor> searchDoctor(List<Doctor> doctorsList, String name);
    abstract List<Doctor> sortDoctors(List<Doctor> doctorsList, Comparator<Doctor> comparator);
    abstract List<Specialization> searchSpecialization(List<Specialization> specializationList, String name);
    abstract List<Doctor> filterDoctors(List<Doctor> doctorList, String criteria, String criteriaValue);
}
