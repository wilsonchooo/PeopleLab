package com.company;

public abstract class Teacher extends Person {
    // Fields
    private String Subject;
    private String Title;

    // Constructor
    public Teacher(String firstName, String familyName, String Subject, String Title)
    {
        super(firstName, familyName);
        this.Subject = Subject;
        this.Title = Title;
    }

    // Methods

    // Getters
    public String getSubject()
    {
        return Subject;
    }
    public String getTitle() {
        return Title;
    }

    // Setters
    public void setSubject(String subject) {
        Subject = subject;
    }
    public void setTitle(String title) {
        Title = title;
    }

    /**
     * @return "Title. FamilyName"
     */

    public String toString()
    {
        return Title + ". " + getFamilyName();
    }
}

