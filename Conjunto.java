import java.util.ArrayList;
import java.util.List;

public class Conjunto implements Componente {
    private List<Componente> listaProdutos;
    private String nome;

    public Conjunto(String nome) {
        this.nome = nome;
        listaProdutos = new ArrayList<>();
    }

    @Override
    public double getPreco() {
        double total = 0;

        for(Componente c:listaProdutos)
        {
          total += c.getPreco();
        }

        return total;
    }

    public void adicionar(Componente componente) {
        listaProdutos.add(componente);
    }

    public void remover(Componente componente) {
        listaProdutos.remove(componente);
    }

    @Override
    public String toString() {
        return "Composicao ( Lista de produtos " + listaProdutos + ", nome = " + nome + " )";
    }
}    
