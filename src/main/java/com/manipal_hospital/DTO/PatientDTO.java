package com.manipal_hospital.DTO;

public class PatientDTO {
    private int id;
    private String name;
    private int age;
    private String Doctor_name;
    private String treatment;
    private int contact;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDoctor_name() {
        return Doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        Doctor_name = doctor_name;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PatientDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", Doctor_name='" + Doctor_name + '\'' +
                ", treatment='" + treatment + '\'' +
                ", contact=" + contact +
                ", address='" + address + '\'' +
                '}';
    }
}
