package objetosexercicio5;
import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//bem como os nomes dessas pessoas caso houver.

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("How many people will be registered?");
        int n = sc.nextInt();

        Pessoa[] vect = new Pessoa[n];

        for (int i = 0; i < n; i++) {

            System.out.printf("Data for the %dth person:%n", i + 1);
            System.out.print("Enter name: ");
            String nome = sc.next();

            System.out.print("Enter age: ");
            int idade = sc.nextInt();

            System.out.print("Enter height: ");
            double altura = sc.nextDouble();

            vect[i] = new Pessoa(nome, idade, altura);
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i].getAltura();
        }

        double avg = sum / n;

        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (vect[i].getIdade() < 16) {
                count++;
            }
        }
        double percentage = (double) count / n * 100.0;

        System.out.printf("PEOPLE UNDER 16: %.1f%%%n", percentage);

        for (int i = 0; i < n; i++) {
            if (vect[i].getIdade() < 16) {
                System.out.println(vect[i].getNome());
            }
        }

        sc.close();
    }

}