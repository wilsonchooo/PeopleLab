package com.company;

public class Classroom {
    // Fields
    private Student[] students;
    private Teacher teacher;

    // Constructor
    public Classroom(Student[] student, Teacher teacher) {
        this.students = student;
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
        double avg = 0.0;
        for (int i = 0; i < students.length; i ++) {
            avg += students[i].getGPA();
        }
        return avg / students.length;
    }

    /**
     * @return class Teacher, then subject, then all students in the class.
     */

    public String printClass() {
        String[] x; x = new String[students.length];
        for (int i = 0; i < students.length; i ++) {
            x[i] = students[i].toString();
        }
        return teacher.toString() + ", " + teacher.getSubject() + ". Students: " + x;
    }
}

/*
    I hear the drums echoing tonight
    But she hears only whispers of some quiet conversation
    She's coming in, 12:30 flight
    The moonlit wings reflect the stars that guide me towards salvation
    I stopped an old man along the way
    Hoping to find some long forgotten words or ancient melodies
    He turned to me as if to say, "Hurry boy, it's waiting there for you"
    It's gonna take a lot to take me away from you
    There's nothing that a hundred men or more could ever do
    I bless the rains down in Africa
    Gonna take some time to do the things we never had
    The wild dogs cry out in the night
    As they grow restless, longing for some solitary company
    I know that I must do what's right
    As sure as Kilimanjaro rises like Olympus above the Serengeti
    I seek to cure what's deep inside, frightened of this thing that I've become
    It's gonna take a lot to drag me away from you
    There's nothing that a hundred men or more could ever do
    I bless the rains down in Africa
    Gonna take some time to do the things we never had
    Hurry boy, she's waiting there for you
    It's gonna take a lot to drag me away from you
    There's nothing that a hundred men or more could ever do
    I bless the rains down in Africa
    I bless the rains down in Africa
    (I bless the rain)
    I bless the rains down in Africa
    (I bless the rain)
    I bless the rains down in Africa
    I bless the rains down in Africa
    (Ah, gonna take the time)
    Gonna take some time to do the things we never had
 */