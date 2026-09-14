package CrusoJAVA.exemplo1;
import java.util.Scanner;

public class exercicio11 {
    /*
    Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de números que serão informados: ");
        int n = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++) {

            System.out.print("Digite o " + (i + 1) + "º número: ");
            int x = sc.nextInt();

            if (x >= 10 && x <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println();
        System.out.println("Quantidade de números dentro do intervalo [10,20]: " + in);
        System.out.println("Quantidade de números fora do intervalo [10,20]: " + out);

        sc.close();
    }
}