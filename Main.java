import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          ProdutoIndividual produto1 = new ProdutoIndividual("Café", 15.65);
          ProdutoIndividual produto2 = new ProdutoIndividual("Leite", 5.5);
          ProdutoIndividual produto3 = new ProdutoIndividual("Cerveja", 15.0);
          ProdutoIndividual produto4 = new ProdutoIndividual("Carne", 98.0);


          Conjunto caixa1 = new Conjunto("Café da Manhã");
        caixa1.adicionar(produto1);
        caixa1.adicionar(produto2);

          Conjunto caixa2 = new Conjunto("Churrasco");
        caixa2.adicionar(produto3);
        caixa2.adicionar(produto4);

        Conjunto carrinho = new Conjunto("Carrinho");
        carrinho.adicionar(produto1);
        carrinho.adicionar(caixa1);
        carrinho.adicionar(caixa2);

        List<Componente> itensPedido = new ArrayList<>();
        itensPedido.add(produto1);
        itensPedido.add(caixa1);
        itensPedido.add(caixa2);
        itensPedido.add(produto3);
        itensPedido.add(produto4);

        Pedido pedido = new Pedido("Brian", itensPedido, 12345);

        System.out.println(pedido);
    }
}
