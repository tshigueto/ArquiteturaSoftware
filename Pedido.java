import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String nomeCliente;
    private List<Componente> lista;
    private int numeroPedido;
    private double totalCompra;

    public Pedido(String nomeCliente, List<Componente> lista, int numeroPedido) {
        this.nomeCliente = nomeCliente;
        this.lista = lista;
        this.numeroPedido = numeroPedido;
        calcularTotalCompra();
    }

    private void calcularTotalCompra() {
        totalCompra = 0;
        for (Componente c : lista) {
            totalCompra += c.getPreco();
        }
    }

    @Override
    public String toString() {
        return "Pedido (Nome Cliente = " + nomeCliente + ", lista = " + lista + ", Numero Pedido = " + numeroPedido + ", Total da Compra = " + totalCompra + " )\n";
    }
}
