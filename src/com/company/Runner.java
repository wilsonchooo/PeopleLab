package com.company;

public class Runner {
    // Fields
    private static String[] firstNames = new String[]{"Abir","Madhi","Parker","Nusrat","Vincent","Jacob","Christina","Andrew","Zeng","Wilson","Mead","Aaron","Karwai","James","Eugene","Bryant","Sabrina","Lack","Kevin","Azarul","Nicholas","Arifur","Rachel","Chen","Kyle","Daniyah","Catelen","Edmund","Jackie","Aaron","Darren","Angela","Jesse"};
    private static String[] familyNames = new String[]{"Ahmed","Ahmed","Ahmed","Alam","Bond-Moore","Cedar","Chau","Chen","Chen","Cho","Gyawu","Jack","Kang","Ko","Korsunsky","Lay","Li","Liu","Liu","Mohammed","Porzio","Rahman","Shek","Stanilovsky","Tam","Wong","Wu","Wu","Wu","Yafet","Yau","Zheng","Han"};

    // Methods
    public static void main(String[] args) {
        int classSize = 36;




        Teacher ourTeacher = new Teacher("Nathan","Folwell","AP Java","Mr");

        Student[] ourStudents = new Student[classSize];
        for (int i = 0; i < classSize; i ++) {
            ourStudents[i] = randomStudent();
        }

    fillSeats();

    }

    /**
     * Builds a random student with a random first name, last name, and GPA.
     * @return Student
     */
    public static Student randomStudent() {
        String randomFirstName = firstNames[(int)(Math.random() * firstNames.length)];
        String randomFamilyName = familyNames[(int)(Math.random() * familyNames.length)];
        double randomGPA = Math.round((Math.random() * 3 + 1) * 100) / 100.0;

        return new Student(randomFirstName, randomFamilyName, randomGPA,12,"Software Engineering");
    }


    public static Student[][] fillSeats() {
        Student[][] seatingChart = new Student[6][6];

        int idx = 0;
        for (int i =0; i<seatingChart.length; i++) {

            for (int x= 0; i < seatingChart[i].length; x++) {

                seatingChart[i][x] = randomStudent();

                idx++;
            }
        }
        System.out.println(seatingChart.toString());

        return seatingChart;
    }
}