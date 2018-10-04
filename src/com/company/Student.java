package com.company;

public class Student extends Person {

    // Fields
    private double GPA;
    private int grade;
    private String major;

    // Constructor
    public Student(String firstName, String familyName, double GPA, int grade, String major) {
        super(firstName, familyName);
        this.GPA = GPA;
        this.grade = grade;
        this.major = major;
    }

    // Methods
    public double getGPA() {
        return GPA;
    }
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public String toString() {
        return getFamilyName() + ", " + getFirstName();
    }
}
