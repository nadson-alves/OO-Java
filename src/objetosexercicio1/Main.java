package objetosexercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Gross salary: ");
        double grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        double tax = sc.nextDouble();

        Employee employee = new Employee(name, grossSalary, tax);

        System.out.printf("Employee: %s, $ %.2f%n",
                employee.name, employee.netSalary());

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();

        employee.increaseSalary(percentage);

        System.out.printf("Updated data: %s, $ %.2f%n",
                employee.name, employee.netSalary());

        sc.close();
    }
}