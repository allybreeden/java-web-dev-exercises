package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your student's name (or ENTER to finish): ");

        do {
            System.out.println("Student's Name: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.println("Student ID Number: ");
                int idNumber = input.nextInt();
                students.put(idNumber, newStudent);
                input.nextLine();
            }
        } while (!newStudent.equals(""));

        input.close();

        printStudents(students);
    }
    static void printStudents (HashMap<Integer, String> students) {
        for (Map.Entry<Integer, String> student: students.entrySet()) {
            System.out.println(student.getValue() + " : " + student.getKey());
        }
    }
}
