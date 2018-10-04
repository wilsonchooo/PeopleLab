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

    public abstract String getFirstName();
    public abstract String getFamilyName();
    public abstract boolean equals(Person p);
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