public class Produto {

    String nome;
    double preco;
    int quantidade;


    public Produto( String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirInformatics() {
        System.out.println("nome: " + nome + " - preco: " + preco + " - quantidade em estoque: " + quantidade + "\n");}


}