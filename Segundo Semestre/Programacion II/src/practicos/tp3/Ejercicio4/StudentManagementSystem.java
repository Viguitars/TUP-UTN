package practicos.tp3.Ejercicio4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add new student");
            System.out.println("2. Display complete student list");
            System.out.println("3. Calculate and display average grade");
            System.out.println("4. Display student with highest grade");
            System.out.println("5. Search student by name");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");
            int option = 0;
            try {
                option = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear input buffer
                continue;
            }

            switch (option) {
                case 1:
                    addStudent(scanner, studentList);
                    break;
                case 2:
                    displayStudentList(studentList);
                    break;
                case 3:
                    calculateAndDisplayAverageGrade(studentList);
                    break;
                case 4:
                    displayStudentWithHighestGrade(studentList);
                    break;
                case 5:
                    searchStudentByName(scanner, studentList);
                    break;
                case 6:
                    System.out.println("Exiting the program...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addStudent(Scanner scanner, List<Student> studentList) {
        System.out.println("\nAdd new student:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = 0;
        try {
            age = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
        } catch (InputMismatchException e) {
            System.out.println(
                    "Invalid input for age. Please enter a valid number.");
            scanner.nextLine(); // Clear input buffer
            return;
        }
        System.out.print("Grade: ");
        double grade = 0;
        try {
            grade = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character
        } catch (InputMismatchException e) {
            System.out.println(
                    "Invalid input for grade. Please enter a valid number.");
            scanner.nextLine(); // Clear input buffer
            return;
        }

        Student student = new Student(name, age, grade);
        studentList.add(student);

        System.out.println("Student added successfully.");
    }

    private static void displayStudentList(List<Student> studentList) {
        System.out.println("\nComplete student list:");
        for (Student student : studentList) {
            System.out.println(
                    "Name: " + student.getName() + ", Age: " + student.getAge() +
                            ", Grade: " + student.getGrade());
        }
    }

    private static void calculateAndDisplayAverageGrade(
            List<Student> studentList) {
        if (studentList.isEmpty()) {
            System.out.println("No students in the list.");
            return;
        }

        double sum = 0;
        for (Student student : studentList) {
            sum += student.getGrade();
        }
        double average = sum / studentList.size();

        System.out.println("Average grade of all students: " + average);
    }

    private static void displayStudentWithHighestGrade(
            List<Student> studentList) {
        if (studentList.isEmpty()) {
            System.out.println("No students in the list.");
            return;
        }

        Student studentWithHighestGrade = studentList.get(0);
        for (Student student : studentList) {
            if (student.getGrade() > studentWithHighestGrade.getGrade()) {
                studentWithHighestGrade = student;
            }
        }

        System.out.println("Student with the highest grade:");
        System.out.println(
                "Name: " + studentWithHighestGrade.getName() + ", Age: " +
                        studentWithHighestGrade.getAge() + ", Grade: " +
                        studentWithHighestGrade.getGrade());
    }

    private static void searchStudentByName(Scanner scanner,
                                            List<Student> studentList) {
        System.out.println("\nSearch student by name:");
        System.out.print("Enter the name of the student: ");
        String nameToSearch = scanner.nextLine();

        boolean found = false;
        for (Student student : studentList) {
            if (student.getName().equalsIgnoreCase(nameToSearch)) {
                System.out.println("Student found:");
                System.out.println("Name: " + student.getName() + ", Age: " +
                        student.getAge() + ", Grade: " + student.getGrade());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No student found with that name.");
        }
    }
}
