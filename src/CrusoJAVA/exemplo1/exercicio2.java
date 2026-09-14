package CrusoJAVA.exemplo1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {
    /*
    exercicio de escrita e saida de dados em java.
    calculando area e valor do imovel do predio e o valor
     */
    static void main(String[] args) {

        //esse comando troca a , por . e faz com que seja americano
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metroquadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroquadrado;

        System.out.printf("Area Quadrada = %.2f%n", area);
        System.out.printf("Valor do imovel = %.3f%n", preco);

        sc.close();

    }
}
