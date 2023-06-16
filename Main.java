public class Main {
    public static void main(String[] args) {
        Pedido pedidoOnline = new PedidoOnline();
        pedidoOnline.processarPedido();

        System.out.println();

        Pedido pedidoLojaFisica = new PedidoLojaFisica();
        pedidoLojaFisica.processarPedido();
    }
}




