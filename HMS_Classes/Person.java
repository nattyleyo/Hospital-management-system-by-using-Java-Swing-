package HMS_Classes;

import java.util.ArrayList;

public abstract class Person {
    private String name;
    private int age;
    private String phone;
    private String gender;
    private String password;
    private ArrayList<Messages> messageses;

    public Person() {
    }

    public Person(String name, int age, String phone, String gender,String password) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.gender = gender;
        this.password=password;
        this.messageses=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Messages> getMessageses() {
        return messageses;
    }

    public void setMessageses(ArrayList<Messages> messageses) {
        this.messageses = messageses;
    }

    
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}

