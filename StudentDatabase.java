import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int studentId;
    String name;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + name;
    }
}

public class StudentDatabase {
    private static final String FILE_PATH = "student_database.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    createDatabase(students, scanner);
                    break;
                case 2:
                    displayDatabase(students);
                    break;
                case 3:
                    deleteRecord(students, scanner);
                    break;
                case 4:
                    updateRecord(students, scanner);
                    break;
                case 5:
                    searchRecord(students, scanner);
                    break;
                case 6:
                    exitProgram();
                    break;
                default:
                    invalidChoice();
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Create Database");
        System.out.println("2. Display Database");
        System.out.println("3. Delete Record");
        System.out.println("4. Update Record");
        System.out.println("5. Search Record");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void createDatabase(ArrayList<Student> students, Scanner scanner) {
        System.out.print("Enter the number of students to add: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("Student ID: ");
            int studentId = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Name: ");
            String name = scanner.nextLine();

            students.add(new Student(studentId, name));
        }

        System.out.println("Database created successfully!");
    }

    private static void displayDatabase(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("Database is empty. No records to display.");
        } else {
            System.out.println("\nStudent Database:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    private static void deleteRecord(ArrayList<Student> students, Scanner scanner) {
        if (students.isEmpty()) {
            System.out.println("Database is empty. No records to delete.");
            return;
        }

        System.out.print("Enter Student ID to delete a record: ");
        int studentIdToDelete = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        boolean recordFound = students.removeIf(student -> student.studentId == studentIdToDelete);

        if (recordFound) {
            System.out.println("Record deleted successfully.");
        } else {
            System.out.println("Record not found with the given Student ID.");
        }
    }

    private static void updateRecord(ArrayList<Student> students, Scanner scanner) {
        if (students.isEmpty()) {
            System.out.println("Database is empty. No records to update.");
            return;
        }

        System.out.print("Enter Student ID to update a record: ");
        int studentIdToUpdate = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (Student student : students) {
            if (student.studentId == studentIdToUpdate) {
                System.out.print("Enter new name: ");
                student.name = scanner.nextLine();
                System.out.println("Record updated successfully.");
                return;
            }
        }

        System.out.println("Record not found with the given Student ID.");
    }

    private static void searchRecord(ArrayList<Student> students, Scanner scanner) {
        if (students.isEmpty()) {
            System.out.println("Database is empty. No records to search.");
            return;
        }

        System.out.print("Enter Student ID to search for a record: ");
        int studentIdToSearch = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (Student student : students) {
            if (student.studentId == studentIdToSearch) {
                System.out.println("Record found:\n" + student);
                return;
            }
        }

        System.out.println("Record not found with the given Student ID.");
    }

    private static void exitProgram() {
        System.out.println("Exiting program. Goodbye!");
        System.exit(0);
    }

    private static void invalidChoice() {
        System.out.println("Invalid choice. Please enter a valid option.");
    }
}
