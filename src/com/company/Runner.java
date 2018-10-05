package com.company;

public class Runner {
    // Fields
    private static String[] firstNames = new String[]{"Abir","Madhi","Parker","Nusrat","Vincent","Jacob","Christina","Andrew","Zeng","Wilson","Mead","Aaron","Karwai","James","Eugene","Bryant","Sabrina","Lack","Kevin","Azarul","Nicholas","Arifur","Rachel","Chen","Kyle","Daniyah","Catelen","Edmund","Jackie","Aaron","Darren","Angela","Jesse"};
    private static String[] familyNames = new String[]{"Ahmed","Ahmed","Ahmed","Alam","Bond-Moore","Cedar","Chau","Chen","Chen","Cho","Gyawu","Jack","Kang","Ko","Korsunsky","Lay","Li","Liu","Liu","Mohammed","Porzio","Rahman","Shek","Stanilovsky","Tam","Wong","Wu","Wu","Wu","Yafet","Yau","Zheng","Han"};

    // Method
    public static void main(String[] args) {
        Teacher ourTeacher = new Teacher("Nathan","Folwell","AP Java","Mr");
        Student[] ourStudents = new Student[32];
        for (int i = 0; i < 32; i ++) {
            ourStudents[i] = randomStudent();
        }
        Classroom ourClassroom = new Classroom(ourStudents, ourTeacher);
        System.out.println(ourClassroom.printClass());
        System.out.println(ourClassroom.classAverage());
    }
    public static Student randomStudent() {
        return new Student(firstNames[(int)(Math.random() * 32)],familyNames[(int)(Math.random() * 32)],(Math.random() * 4),12,"Software Engineering");
    };
}


/*
 Fields:
 Static String[] firstNames; //a pre-made list of first names
 Static String[] familyNames; //a pre-made list of family names
 Method (Only the main method):
 public static void main(String[] args)
 - Declare and initialize a teacher, an array of students, and a classroom
 - Print Class, and print class Average.
 randomStudent() - builds a random student with a random first name, last name, and GPA
 */