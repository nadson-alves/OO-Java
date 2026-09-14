package CrusoJAVA.exemplo1;

import java.util.Scanner;

public class exercicio4 {
    //exercicio de calculo de diferenca, usando leitura e escrita de codigos
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = sc.nextInt();
        System.out.print("Digite o valor de C: ");
        int c = sc.nextInt();
        System.out.print("Digite o valor de D: ");
        int d = sc.nextInt();

        int diferenca = a * b - c * d;

        System.out.printf("Diferenca = %d", diferenca);

        sc.close();

    }
}
