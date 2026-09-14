package objetosexercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the student's information :");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Grade 1: ");
        double grade1 = sc.nextDouble();

        System.out.print("Grade 2: ");
        double grade2 = sc.nextDouble();

        System.out.print("Grade 3: ");
        double grade3 = sc.nextDouble();

        Student student = new Student(name, grade1, grade2, grade3);

        System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());

        if (student.approved()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        }

        sc.close();

    }
}