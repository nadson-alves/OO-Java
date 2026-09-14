package objetosexercicio7;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
//no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
//os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
//igual a 6.0 (seis).
//nesse eu fiz diferente troquei a grade 1 e 2, acrecentei 4 grades.. e continuando o processo

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students will be entered? ");
        int n = sc.nextInt();

        // Vetor de objetos Student
        Student[] vect = new Student[n];

        // Cadastra os alunos e suas notas
        for (int i = 0; i < n; i++) {

            System.out.printf("Data for student %d:%n", i + 1);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Grade 1: ");
            double grade1 = sc.nextDouble();

            System.out.print("Grade 2: ");
            double grade2 = sc.nextDouble();

            System.out.print("Grade 3: ");
            double grade3 = sc.nextDouble();

            System.out.print("Grade 4: ");
            double grade4 = sc.nextDouble();

            vect[i] = new Student(name, grade1, grade2, grade3, grade4);
        }

        System.out.println("\nFinal results:");

        // Calcula a média e verifica a situação de cada aluno
        for (int i = 0; i < n; i++) {

            double average = (
                    vect[i].getGrade1()
                            + vect[i].getGrade2()
                            + vect[i].getGrade3()
                            + vect[i].getGrade4()
            ) / 4.0;

            if (average >= 6.0) {
                System.out.printf("%s - Average: %.2f - Approved%n",
                        vect[i].getName(), average);
            } else {
                System.out.printf("%s - Average: %.2f - Failed%n",
                        vect[i].getName(), average);
            }
        }

        sc.close();
    }
}