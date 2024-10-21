package org.example;

public class User {
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;

    }
    public String getLastName() {
        return lastName;
    }
    public void displayUserDetails() {
        System.out.println("Firstname: " + firstName + "\n Lastname: " + lastName);

    }
}
