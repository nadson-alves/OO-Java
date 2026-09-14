package CrusoJAVA.exemplo1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {

        //exercicio de if else, produzindo numeros multiplos e nao multiplos,
        // usando leitura e escrita
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("digite o valor de A:");
        int A = sc.nextInt();
        System.out.printf("digite o valor de B:");
        int B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.printf("São Multiplos");
        } else {
            System.out.printf("Não São Multiplos");
        }

        sc.close();

    }
}
