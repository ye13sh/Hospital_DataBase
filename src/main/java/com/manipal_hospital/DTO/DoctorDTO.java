package com.manipal_hospital.DTO;

public class DoctorDTO {
    private int id;
    private String name;
    private int age;
    private int contact;
    private String mail;
    private String qualification;
    private String specialization;
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

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "DoctorDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", contact=" + contact +
                ", mail='" + mail + '\'' +
                ", qualification='" + qualification + '\'' +
                ", specialization='" + specialization + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
