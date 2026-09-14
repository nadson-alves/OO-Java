package CrusoJAVA.exemplo1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args) {
        /*
        exercicio: Leia a hora inicial e a hora final de um jogo.
        A seguir calcule a duração do jogo, sabendo que o mesmo pode
        começar em um dia e terminar em outro,
        tendo uma duração mínima de 1 hora e máxima de 24 horas.
        */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("digite o horarios inicial:");
        double horarioInicial = sc.nextDouble();
        System.out.printf("digite o horario final:");
        double horarioFinal = sc.nextDouble();
        double duracao;

        if (horarioInicial < horarioFinal) {
            duracao = horarioFinal - horarioInicial;
        } else {
            duracao = (24.00 - horarioInicial) + horarioFinal;
        }
        System.out.printf("O jogo durou %.2f Horas!", duracao);
        sc.close();
}
}
