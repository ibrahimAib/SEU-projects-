class Student {

    int stuID;

    String fName;

    double gpa;
    static int Id;

    Student(int stuID, String fName, double gpa) {

        this.stuID = stuID;

        this.fName = fName;

        this.gpa = gpa;
        Id++;

    }

    void display() {

        System.out.println("the ID: " + +Id + "\n" + stuID + " " + fName + " " + gpa + "\n");

    }

}

class StudentTest {

    public static void main(String args[]) {

        Student student1 = new Student(200200100, "Khalid", 3.5);
        student1.display();

        Student student2 = new Student(200200200, "Abdulaziz", 3.7);
        student2.display();

        Student student3 = new Student(200200300, "Mohammed", 2.4);
        student3.display();

    }

}