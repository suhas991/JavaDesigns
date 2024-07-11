package com.ust.model;

public class Trainee {

    private int id;
    private String name;
    private String email;
    private String location;
    private String phoneNumber;
    private String gender;

    public Trainee(TraineeBuilder builder) {
        this.id = builder.getId();
        this.name = builder.getName();
        this.email = builder.getEmail();
        this.location = builder.getLocation();
        this.phoneNumber = builder.getPhoneNumber();
        this.gender = builder.getGender();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getLocation() {
        return location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", location='" + location + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
