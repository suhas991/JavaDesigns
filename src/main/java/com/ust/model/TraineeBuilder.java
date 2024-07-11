package com.ust.model;

public class TraineeBuilder {

    private int id;
    private String name;
    private String email;
    private String location;
    private String phoneNumber;
    private String gender;

    public TraineeBuilder(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public TraineeBuilder location(String location) {
        this.location = location;
        return this;
    }

    public TraineeBuilder phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public TraineeBuilder gender(String gender) {
        this.gender = gender;
        return this;
    }

    public Trainee build() {
        return new Trainee(this);
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
}
