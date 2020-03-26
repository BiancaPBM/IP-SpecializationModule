import java.util.*;

public abstract class User {
    protected String name;
    protected int age;
    protected String address;
    protected String email;
    protected String telephone;

    abstract boolean login();
    abstract boolean sendMessage(User user, String message);
    abstract Doctor searchDoctor(List<Doctor> doctorList, String name);
    abstract <T> List<Doctor> sortDoctors(List<Doctors> doctorsList, Comparator<T> comparator);
    abstract Specialization searchSpecialization(String name);
    abstract List<Doctor> filterDoctors(List<Doctor> doctorList, String criteria);
}
