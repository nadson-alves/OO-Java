package objetosexercicio4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Permite receber os dados digitados pelo usuário
        Scanner sc = new Scanner(System.in);

        // Solicita o número da conta
        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        // Solicita o nome do titular
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        // Pergunta se haverá depósito inicial
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        // Declara a variável que irá guardar a conta
        Account account;

        // Verifica se o cliente fará um depósito inicial
        if (response == 'y') {

            // Solicita o valor do depósito inicial
            System.out.print("Enter initial deposit: ");
            double initialDeposit = sc.nextDouble();

            // Cria a conta usando o construtor com depósito inicial
            account = new Account(number, holder, initialDeposit);

        } else {

            // Cria a conta sem depósito inicial
            account = new Account(number, holder);
        }

        // Mostra os dados da conta recém-criada
        System.out.println();
        System.out.println("Account data:");
        System.out.println("Account number: " + account.getNumber());
        System.out.println("Account holder: " + account.getHolder());
        System.out.printf("Account balance: %.2f%n", account.getBalance());

        // Solicita um valor para depósito
        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();

        // Realiza o depósito através do método da classe Account
        account.deposit(deposit);

        // Mostra os dados após o depósito
        System.out.println();
        System.out.println("Updated account data:");
        System.out.println("Account number: " + account.getNumber());
        System.out.println("Account holder: " + account.getHolder());
        System.out.printf("Account balance: %.2f%n", account.getBalance());

        // Solicita um valor para saque
        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();

        // Realiza o saque através do método da classe Account
        account.withdraw(withdraw);

        // Mostra os dados após o saque
        System.out.println();
        System.out.println("Updated account data:");
        System.out.println("Account number: " + account.getNumber());
        System.out.println("Account holder: " + account.getHolder());
        System.out.printf("Account balance: %.2f%n", account.getBalance());

    }
}