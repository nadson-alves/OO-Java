package CrusoJAVA.exemplo1;

import java.util.Locale;
import java.util.Scanner;


public class exercicio6 {

    public static void main(String[] args) {

        /*
        exercicio executado dessa forma com as figuras geometricas
        a) a área do triângulo retângulo que tem A por base e C por altura.
        b) a área do círculo de raio C. (pi = 3.14159)
        c) a área do trapézio que tem A e B por bases e C por altura.
        d) a área do quadrado que tem lado B.
        e) a área do retângulo que tem lados A e B.
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C;

        System.out.print("Digite o valor de A: ");
        A = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        B = sc.nextDouble();
        System.out.print("Digite o valor de C: ");
        C = sc.nextDouble();

        double areaTriangulo = (A * C) / 2;
        double areaCirculo = 3.14159 * C * C;
        double areaTrapezio = (A + B) * C / 2;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.2f%n", areaTriangulo);
        System.out.printf("CIRCULO: %.2f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.2f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.2f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.2f%n", areaRetangulo);

        sc.close();
    }
}