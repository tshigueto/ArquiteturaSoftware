public class ProdutoIndividual implements Componente {

    private String nome;
    private double preco;

    public ProdutoIndividual(String nome, double preco)
    {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getPreco() 
    {
        return preco;
    }

    @Override
    public String toString() {
        return " Produto ( Nome = " + nome + ", preco = " + preco + " )";
    }   

}
