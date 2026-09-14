package objetosexercicio4;

//ENUNCIADO DO EXERCICIO
//Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
//titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
//inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
//conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
//Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
//o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
//exemplo).
//Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
//isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
//realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
//suficiente para realizar o saque e/ou pagar a taxa.
//Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
//informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
//mostrando os dados da conta após cada operação.

public class Account {

    // Dados da conta
    private int number;
    private String holder;
    private double balance;


    // Construtor usado quando a conta é criada sem depósito inicial
    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }


    // Construtor usado quando a conta é criada com depósito inicial
    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        this.balance = initialDeposit;
    }


    // Retorna o número da conta
    public int getNumber() {
        return number;
    }


    // Retorna o nome do titular
    public String getHolder() {
        return holder;
    }


    // Permite alterar o nome do titular
    public void setHolder(String holder) {
        this.holder = holder;
    }


    // Retorna o saldo atual da conta
    public double getBalance() {
        return balance;
    }


    // Realiza um depósito e aumenta o saldo
    public void deposit(double amount) {
        balance += amount;
    }


    // Realiza um saque e desconta também a taxa de R$ 5,00
    public void withdraw(double amount) {
        balance -= amount + 5.00;
    }
}