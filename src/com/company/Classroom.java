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
    [Intro]
Ahhhh
(Gas, gas, gas)
Ahhhh
Do you like my car?
(My car, my car,)

[Verse 1]
Guess you're ready
'Cause I'm waiting for you
It's gonna be so exciting!
Got this feeling
Really deep in my soul
Let's get out, I wanna go
Come along... get it on!

[Pre-Refrain]
Gonna take my car
Gonna see me
Gonna drive along 'til I get you
'Cause I'm crazy... hot and ready
But you'll like it!
I wanna race for you!
Shall I go now?

[Refrain]
Gas gas gas!
I'm gonna step on the gas
Tonight I'll fly!
And be your lover
Yeah yeah yeah!
I'll be so quick as a flash
And I'll be your hero

Gas gas gas!
I'm gonna run as a flash
Tonight I'll fight!
To be the winner
Yeah yeah yeah!
I'm gonna step on the gas
And you'll see the big show!

[Verse 2]
Don't be lazy
'Cause I'm burning for you
It's like a hot sensation!
Got this power
That is taking me out
Yes, I've got a crush on you
Ready, now
Ready, go!

[Pre-Refrain]
Gonna take my car
Gonna see me
Gonna drive along 'til I get you
'Cause I'm crazy... hot and ready
But you'll like it!
I wanna race for you!
Shall I go now?

[Refrain]
Gas gas gas!
I'm gonna step on the gas
Tonight I'll fly!
And be your lover
Yeah yeah yeah!
I'll be so quick as a flash
And I'll be your hero

Gas gas gas!
I'm gonna run as a flash
Tonight I'll fight!
To be the winner
Yeah yeah yeah!
I'm gonna step on the gas
And you'll see the big show!

[Solo]

[Verse 1 Repeated]
Guess you're ready
'Cause I'm waiting for you
It's gonna be so exciting!
Got this feeling
Really deep in my soul
Let's get out, I wanna go
Come along, get it on

[Pre-Refrain]
Gonna take my car
Do you like my car?
'Cause I'm crazy... hot and ready
But you'll like it!
I wanna race for you!
Shall I go now?

[Refrain]
Gas gas gas!
I'm gonna step on the gas
Tonight I'll fly!
And be your lover
Yeah yeah yeah!
I'll be so quick as a flash
And I'll be your hero

Gas gas gas!
I'm gonna run as a flash
Tonight I'll fight!
To be the winner
Yeah yeah yeah!
I'm gonna step on the gas
And you'll see the big show!

[Outro]
Gas gas gas!
Yeah yeah yeah!
Gas gas gas!
And you'll see the big show!
 */