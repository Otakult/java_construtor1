import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> estoque = new ArrayList();
        Produto produto1 = new Produto("bala",0.10, 100);
        Produto produto2 = new Produto("caneta",1.50, 30);
        Produto produto3 = new Produto("boneco",45.00, 12);
        estoque.add(produto1);
        estoque.add(produto2);
        estoque.add(produto3);
        System.out.println("Tipos de produto em estoque: "+estoque.size());
        System.out.println(estoque);
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Produto C", 12.75, 2, "2023-12-31");
        System.out.println(produtoPerecivel);
    }
}