package CrusoJAVA.exemplo1;
import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.printf("Digite o código do combustível:  %n" +
                "alcool 1" +
                " - gasolina 2" +
                " - diesel 3 ");
        int codigo = sc.nextInt();

        while (codigo != 4) {

            if (codigo == 1) {
                alcool++;
            }
            else if (codigo == 2) {
                gasolina++;
            }
            else if (codigo == 3) {
                diesel++;
            }
            else {
                System.out.println("Código inválido!");
            }

            System.out.printf("Digite novamente o código: ");
            codigo = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}