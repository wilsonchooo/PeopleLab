package com.company;

public abstract class Person {
    // Fields
    private String firstName, familyName;

    // Constructor
    public Person(String firstName, String familyName) {
        this.firstName = firstName;
        this.familyName = familyName;
    }

    // Methods
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFamilyName() {
        return familyName;
    }
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
    public boolean equals(Person p) {
        return (firstName.equals(familyName));
    }
}