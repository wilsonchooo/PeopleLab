package com.company;

public class Classroom {
    // Fields
    private Student[] students;
    private Teacher teacher;
    public Student[][] seatingChart = new Student[6][6];

    // Constructor
    public Classroom(Student[] students, Teacher teacher) {
        this.students = students;
        this.teacher = teacher;
    }

    // Methods

    // Getters
    public Student[] getStudents() {
        return students;
    }
    public Teacher getTeacher() {
        return teacher;
    }

    // Setters
    public void setStudents(Student[] students) {
        this.students = students;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    /**
     * Adds up the GPAs of all students and divides by # of students.
     * @return average of GPAs of students
     */

    public double classAverage() {
        double sum = 0;

        for (Student cur : students)
            sum += cur.getGPA();

        return sum / students.length;
    }

    /**
     * @return class Teacher, then subject, then all students in the class.
     */

    public String printClass() {
        String studentString = "";

        for (int i = 0; i < students.length; i++) {
            studentString += "\n" + (i + 1) + ". " + students[i].toString();
        }

        return "Teacher: " + teacher.toString() +
                "\nSubject: " + teacher.getSubject() +
                "\nStudents: " + studentString;
    }




}