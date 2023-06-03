package HMS_Classes;

import java.util.ArrayList;



public class Patient extends Person{
     private String patientID;
     private boolean checkInStatus;
     private  double bill;
     private String checkInValue;
     private ArrayList<Appointment> patientAppointments;

     private ArrayList<Prescription>prescriptions;
     public Patient(){

     }

    public Patient(String name, int age, String phone,String gender ,String password,String patientID,boolean checkInStatus) {
        super(name, age, phone, gender,password);
        this.patientID = patientID;
        this.checkInStatus=checkInStatus;
        patientAppointments=new ArrayList<>();
        prescriptions=new ArrayList<>();
    }

    public String getPatientID() {
         return patientID;
    }

    public void setPatientID(String patientID) {
         this.patientID = patientID;
    }

    public boolean isCheckInStatus() {
         return checkInStatus;
    }

    public void setCheckInStatus(boolean checkInStatus) {
         this.checkInStatus = checkInStatus;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public String getCheckInValue() {
         return checkInValue;
    }

    public void setCheckInValue(String checkInValue) {
        this.checkInValue = checkInValue;
    }

    public ArrayList<Appointment> getAppointments() {
        return patientAppointments;
    }

    public void setAppointments(ArrayList<Appointment> appointments) {
        this.patientAppointments = appointments;
    }

    public ArrayList<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(ArrayList<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientID='" + patientID + '\'' +
                ", checkInStatus=" + checkInStatus +
                ", bill=" + bill +
                ", checkInValue='" + checkInValue + '\'' +
                ", patientAppointments=" + patientAppointments +
                ", prescriptions=" + prescriptions +
                '}';
    }
}
