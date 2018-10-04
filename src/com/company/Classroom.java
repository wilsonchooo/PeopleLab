package com.company;

public class Classroom extends Person {
    private String firstName;
    private String familyName;

    public Classsroom(String firstName, String familyName) {
        super("Classroom");
        this.firstName = firstName;
        this.familyName = familyName;
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