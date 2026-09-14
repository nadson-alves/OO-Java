package CrusoJAVA;

public class ExpressoesJava {
    /*
    operadores de comparação
    < menor que
    > maior que
    <= menor ou igual
    >= maior ou igual
    == igual a
    != diferente de
    &&   E - basta uma falsa para se torna falsa
    ||   OU - basta uma verdadeira para se torna verdadeiro
    !   NÃO
    %   retoma o resto de uma divisao = modulo

    ESTRUTURA CONDICIONAL
    if (condicao) {  -  a condicao vai ser a regra para executar o comando, atingindo a regra
        comando 1       o comando é executado, nao atingindo ele passa para o proximo nivel
        comando 2       no caso o else, se eu quiser fazer um encadeamento mais de duas opcoes
    }                   adiciono mais uma estrutura dentro do else.
    else {
        comando 1
        comando 2
    }


    Exemplo 2  - uma estrutua com varias opcoes de condicionais
    if (condicao) {
    comando1
    comando2
    } else if (condicao2) {
    comando3
    comendo4
    } else if (condicao3) {
    comando5
    comendo6
    }
    else {
    comendo7
    comendo8
    }

    OPERADORES DE ATRIBUICAO CUMULATIVA
    a += b  é a mesma coisa que a = a + b
    a -= b  é a mesma coisa que a = a - b
    a *= b  é a mesma coisa que a = a * b
    a /= b  é a mesma coisa que a = a / b
    a %= b  é a mesma coisa que a = a % b

    exemplo:
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();

        double conta = 50.0;
        if (minutos > 100) {
        conta += (minutos - 100) * 2.0;
        }

        System.out.printf("valor da conta = %.2f%n", conta);

    ESTRUTURA SWITCH-CASE
    switch (expressao) {
    case 1:
    comando1
    comando2
    break;
    case 2:
    comando3
    comando4
    break;
      case 3:
    comando5
    comando6
    break;
    default:
    comando7
    comando8
    break;
    }

    CONDICIONAL TERNARIA
    (condicao) ? valor se verdadeiro : valor se falso
    exemplo: (2 > 4) ? 50 : 80 = 80 - caso a condicao seja falsa entra o valor do falso,
                                      caso seja verdadeira entra no valor verdadeiro
                                      no exemplo o valor 2 não é maior que o valor 4
                                       então é falsa e entra o valor 80!


   EXTRUTURA WHILE
    while (condicao){   -   ENQUANTO uma condição for verdadeira,
    comando1                continue executando o código.
    comando2
   }

   Extrutura FOR
   for (inicio ; condicao ; incremento) {
   comando 1
   comando 2
   }

   EXTRTUTURA DO WHILE
   do {
   comando1
   comando2
   } while (condicao);

   OREPADORES BITWIRE
   &  - operador E bit a bit
   |  - operador ou bit a bit
   chapel  - operador ou-exclusivo bit a bit
   serve para calcular numeros binarios

   FUNÇÕES STRING MAIS UTILIZADAS
   formatar: toLowerCase() - transforma para minusculo, toUpperCase() - transforma para maiusculo,
    trim() - remover espacos
    Recortar: substring(inicio) - informando inicio, substring(inicio, fim) - informando inicio e fim
   Substituir: Replace(char,char), Replace(string,string)
   Buscar: IndexOf, LastIndexOf
   str.Split("") - serve para recorta uma string com base no que escrever no campo

   EXEMPLO NA PRATICA:
   String original = "abcde FGHIJ ABC abc DEFG   ";
String s01 = original.toLowerCase();
String s02 = original.toUpperCase();
String s03 = original.trim();
String s04 = original.substring(2);
String s05 = original.substring(2, 9);
String s06 = original.replace('a', 'x');
String s07 = original.replace("abc", "xy");
int i = original.indexOf("bc");
int j = original.lastIndexOf("bc");

System.out.println("Original: -" + original + "-");
System.out.println("toLowerCase: -" + s01 + "-");
System.out.println("toUpperCase: -" + s02 + "-");
System.out.println("trim: -" + s03 + "-");
System.out.println("substring(2): -" + s04 + "-");
System.out.println("substring(2, 9): -" + s05 + "-");
System.out.println("replace('a', 'x'): -" + s06 + "-");
System.out.println("replace('abc', 'xy'): -" + s07 + "-");
System.out.println("Index of 'bc': " + i);
System.out.println("Last index of 'bc': " + j)

   FUNCAO SPLIT

   String s = "potato apple lemon";
String[] vect = s.split(" ");
String word1 = vect[0];
String word2 = vect[1];
String word3 = vect[2];
vai separar a frase e dividir ela em varias palavras uma abaixo da outra

    FUNÇÕES
    Math.sqrt() → calcula raiz quadrada
    Math.pow() → calcula potência = multiplicacao do mesmo numero exemplo 2 elevado a 2!
    Math.abs() → calcula o valor absoluto = quando o numero esta distante do zero


public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter three numbers:");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int higher = max(a, b, c);
showResult(higher);
sc.close();
}
public static int max(int x, int y, int z) {
int aux;
if (x > y && x > z) {
aux = x;
} else if (y > z) {
aux = y;
} else {
aux = z;
}
return aux;
}
public static void showResult(int value) {
System.out.println("Higher = " + value);
}
}

METODO OBJETO
getClass  - retorna o tipo do objeto
equals - compara se o objeto e igual ao outro
hashCode - retorna um codigo hash do objeto
toString - converte o objeto para string

Construtor
•É uma operação especial da classe, que executa no momento da instanciação do objeto
•Usos comuns:
• Iniciar valores dos atributos
• Permitir ou obrigar que o objeto receba dados / dependências no momento de sua instanciação (injeção de dependência)
•Se um construtor customizado não for especificado, a classe disponibiliza o construtor padrão:
Product p = new Product();
•É possível especificar mais de um construtor na mesma classe (sobrecarga)

Sobrecarga
•É um recurso que uma classe possui de oferecer mais de uma
operação com o mesmo nome, porém com diferentes listas de
parâmetros.

VETORES
package application;
import java.util.Locale;
import java.util.Scanner;
public class Program {
public static void main(String[] args) {
Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
double[] vect = new double[n];
for (int i=0; i<n; i++) {
vect[i] = sc.nextDouble();
}
double sum = 0.0;
for (int i=0; i<n; i++) {
sum += vect[i];
}
double avg = sum / n;
System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
sc.close();
}
}





     */
}
