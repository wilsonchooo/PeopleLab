package com.company;

public class Classroom {
    private Student[] students;
    private Teacher teacher;

    public Classroom(Student[] student, Teacher teacher) {
        this.students = student;
        this.teacher = teacher;
    }

    public String getSubject() {
        return teacher.getSubject();
    }
    public double classAverage() {
        double avg = 0.0;
        for (int i = 0; i < students.length; i ++) {
            avg += students[i].getGPA();
        }
        return avg / students.length;
    }
    public String printClass() {
        String[] x;
        for (int i = 0; i < students.length(); i ++) {
            x[i] = students[i]. // here
        }
        return teacher.toString +
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