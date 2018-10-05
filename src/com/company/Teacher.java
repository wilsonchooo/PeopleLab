package com.company;

public abstract class Teacher extends Person {
    //Fields
    public String Subject;
    public String Title;

    //Constructor
    public abstract String getFamilyName();
    public Teacher(String Subject, String Title)
    {
        super("Teacher", "familyName");
        this.Subject = Subject;
        this.Title = Title;
    }
    public String getSubject()
    {
        return Subject;
    }
    public String toString()
    {
        return Title + ". " + familyName;
    }
}

