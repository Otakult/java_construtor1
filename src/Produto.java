public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    public Produto(){

    }
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public String toString(){
        return "Produto: " + this.nome + ", preço: " +this.preco + ", quantidade em estoque: "+ this.quantidade;
    }
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
