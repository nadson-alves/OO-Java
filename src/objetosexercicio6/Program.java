package objetosexercicio6;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
//devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
//da pessoa mais velha.

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will be entered? ");
        int n = sc.nextInt();

        // Vetor de objetos Pessoa
        Pessoa[] vect = new Pessoa[n];

        // Cadastra as pessoas
        for (int i = 0; i < n; i++) {

            System.out.printf("Data for person %d:%n", i + 1);

            System.out.print("Name: ");
            String nome = sc.next();

            System.out.print("Age: ");
            int idade = sc.nextInt();

            vect[i] = new Pessoa(nome, idade);
        }

        int position = 0;

        // Procura a maior idade no vetor
        for (int i = 1; i < n; i++) {

            if (vect[i].getIdade() > vect[position].getIdade()) {
                position = i;
            }
        }

        // Mostra o nome da pessoa mais velha
        System.out.println("Older person: " + vect[position].getNome());

        sc.close();
    }
}