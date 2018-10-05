package com.company;

public abstract class Teacher extends Person {
    //Fields
    private String Subject;
    private String Title;

    //Constructor
    public Teacher(String firstName, String familyName, String Subject, String Title)
    {
        super(firstName, familyName);
        this.Subject = Subject;
        this.Title = Title;
    }
    public String getSubject()
    {
        return Subject;
    }
    public String toString()
    {
        return Title + ". " + getFamilyName();
    }
}

