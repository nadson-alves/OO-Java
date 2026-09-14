package CrusoJAVA.exemplo1;

import java.util.Locale;
import java.util.Scanner;

/*
CRIOU UMA CLASSE POR FORA E FEZ UMA LIGACAO DE CLASSES, DEIXANDO APENAS DUAS VARIAVEIS PARA
REPRESENTAR OS 3 VALORES DOS DOIS TRIANGULOS COMO X E Y, como quei um abaixo do outro para ver
diferença !

packageapplication;
import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;
public class Program{
public staticvoid main(String[] args) {
Locale.setDefault(Locale.US);
Scanner sc= newScanner(System.in);


Triangle x, y;
x = newTriangle();
y = newTriangle();


System.out.println("Enter the measures of triangle X: ");
x.a= sc.nextDouble();
x.b= sc.nextDouble();
x.c= sc.nextDouble();
System.out.println("Enter the measures of triangle Y: ");
y.a= sc.nextDouble();
y.b= sc.nextDouble();
y.c= sc.nextDouble();
double p= (x.a + x.b + x.c) / 2.0;
double areaX = Math.sqrt(p* (p-x.a) * (p-x.b) * (p-x.c));
p = (y.a+ y.b+ y.c) / 2.0;
double areaY = Math.sqrt(p* (p-y.a) * (p-y.b) * (p-y.c));
 */

public class exercicio14 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measures of triangle X: ");
        xA= sc.nextDouble();
        System.out.println("Enter the measures of triangle X: ");
        xB= sc.nextDouble();
        System.out.println("Enter the measures of triangle X: ");
        xC= sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        yA= sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        yB= sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        yC= sc.nextDouble();

        double p= (xA+ xB+ xC) / 2.0;
        double areaX= Math.sqrt(p* (p-xA) * (p-xB) * (p-xC));

        p= (yA+ yB+ yC) / 2.0;
        double areaY= Math.sqrt(p* (p-yA) * (p-yB) * (p-yC));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        if(areaX> areaY) {
            System.out.println("Largerarea: X");
        }
        else{
            System.out.println("Largerarea: Y");
        }
        sc.close();
    }
}