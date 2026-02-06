import java.util.Scanner;

class Student {
    String name;
    int rollNo;

    // TODO: Create a parameterized constructor Student(String name, int rollNo)
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // TODO: Create a method or use direct access to print details in the required format
    public void printDetails() {
        System.out.println("Name: " + name + " Roll: " + rollNo);
    }
}

public class StudentClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.nextLine();
        int rollNo1 = scanner.nextInt();
        scanner.nextLine(); 

        String name2 = scanner.nextLine();
        int rollNo2 = scanner.nextInt();
        scanner.nextLine();
        
        
        // TODO: Create two Student objects
        Student student1 = new Student(name1, rollNo1);
        Student student2 = new Student(name2, rollNo2);

        // TODO: Print details for both students
        student1.printDetails();
        student2.printDetails();
    }
}
