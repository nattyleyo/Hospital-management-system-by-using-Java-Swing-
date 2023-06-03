package HMS_Classes;

import java.util.ArrayList;



public class Doctor extends Staff{

    private String speciality;
    private ArrayList<Appointment> doctorAppointments;

    public Doctor(String name, int age, String phone,String gender,String password, String staffId,double salary,String speciality) {
        super(name, age, phone, gender,password,staffId, salary);
        this.speciality = speciality;
        doctorAppointments=new ArrayList<>();
    }

    public String getSpeciality() {

        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public ArrayList<Appointment> getDoctorAppointments() {
        return doctorAppointments;
    }

    public void setDoctorAppointments(ArrayList<Appointment> doctorAppointments) {
        this.doctorAppointments = doctorAppointments;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "speciality='" + speciality + '\'' +
                '}';
    }
}
