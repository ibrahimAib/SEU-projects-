class Student {
    int stuID;
    String fName;
    double gpa;

    Student(int stuID, String fName, double gpa) {
        this.stuID = stuID; // add this to rever to the fild.
        this.fName = fName; // add this to rever to the fild.
        this.gpa = gpa; // add this to rever to the fild.
    }

    void display() {
        System.out.println(stuID + " " + fName + " " + gpa);
    }
}

class StudentTest {
    public static void main(String args[]) {
        Student student1 = new Student(200200100, "Khalid", 3.5);
        Student student2 = new Student(200200200, "Abdulaziz", 3.7); // add "new" to create a new object, and correct
                                                                     // the name of the constructor.
        Student student3 = new Student(200200300, "Mohammed", 2.4);
        student1.display();
        student2.display();
        student3.display();
    }
}
