package com.company;

public class Classroom {
    // Fields
    private Student[] students;
    private Teacher teacher;
    private Student[][] seatingChart = new Student[6][6];
    private int maxNameLength;

    // Constructor
    public Classroom(Student[] students, Teacher teacher) {
        this.students = students;
        this.teacher = teacher;
        fillSeats();
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
     * @return class Teacher, then subject, then all students in the class as a linear list.
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

    /**
     * Uses the 2-dimensional seating chart array to print out the students in rows/columns.
     * Only names of students are printed for brevity.
     * @return A string with students' names arranged by the seating chart.
     */
    public String printSeatingChart() {
        String out = "Seating Chart";
        for (Student[] studentArr : seatingChart) {
            out += "\n";
            for (Student student : studentArr) {
                out += student.getName();
                for (int i = 0; i < maxNameLength - student.getName().length(); i++)
                    out += " ";
                out += " | ";
            }
        }
        return out;
    }

    /**
     * Populates the seatingChart 2-dimensional array with the students array
     * by each column, then each row.
     */
    private void fillSeats() {
        int idx = 0;
        for (Student[] studentArr : seatingChart) {
            for (int i = 0; i < studentArr.length; i++) {
                if (students[idx] == null)
                    break;
                Student student = students[idx];
                maxNameLength = Math.max(maxNameLength, student.getName().length());
                studentArr[i] = student;
                idx++;
            }
        }
    }
}