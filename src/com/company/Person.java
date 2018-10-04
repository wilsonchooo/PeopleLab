package com.company;

public abstract class Person {
    // Fields
    private String firstName;
    private String familyName;

    // Constructor
    public Person(String firstName, String familyName) {
        this.firstName = firstName;
        this.familyName = familyName;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public String getFamilyName() {
        return this.familyName;
    }
    public boolean equals(Person p) {
        return (this.firstName.equals(this.familyName));
    }
}


/*
Fields:
firstName, familyName
Methods:
Constructor – must initialize fields
getFirstName() - returns first name
getFamilyName() - returns family name
equals(Person p) – returns true if first and family name are equal
 */