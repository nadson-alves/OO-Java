package CrusoJAVA.exemplo1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        //exercicio de calcular as horas trabalhadas do cliente leitura e escrita de dados
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero do funcionario: ");
        double numero = sc.nextDouble();
        System.out.print("Digite as horas trabalhadas: ");
        double horas = sc.nextDouble();
        System.out.print("Digite o valor por hora trabalhada: ");
        double valor = sc.nextDouble();

        double salario = horas * valor;

        System.out.printf("numero do funcionario = %.2f%n", numero);
        System.out.printf("salario do funcionaio = U$ %.2f%n", salario);

        sc.close();

    }
}
