package ex005;

public class PedidoTeste {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(123, "João Silva", 250.75);

        System.out.println("Número do pedido: " + pedido.getNumeroPedido());
        System.out.println("Nome do cliente: " + pedido.getNomeCliente());
        System.out.println("Valor total: R$ " + pedido.getValorTotal());
    }
}
