package com.company;

public class Classroom extends Person {
    private String firstName;
    private String familyName;

    public Classroom(String firstName, String familyName) {
        super("Classroom");
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

Fields:
Student[] students;
Teacher teacher;
Methods:
Constructor – must initialize fields
getSubject() - returns the teacher’s subject
classAverage() - add up the GPAs of all students and divide by # of students
printClass() - Print the class Teacher then subject then all students in the class
 */