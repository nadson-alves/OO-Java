package CrusoJAVA.exemplo1;

import java.util.Scanner;

public class exercicio3 {
       //CALCULAR A AREA DE UM CIRCULO usando entrada e saida de dados (digitando os dados)

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Digite o valor de raio: ");
            double raio = sc.nextDouble();

            double area = Math.PI * Math.pow(raio, 2);

            System.out.printf("Área do círculo: %.4f%n", area);

            sc.close();
        }

}
