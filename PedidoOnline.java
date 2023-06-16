class PedidoOnline extends Pedido{
    @Override
    public void validaestoque() {
        System.out.println("PedidoOnline , validaestoque"); 
    }
    @Override
    public void prepararPedido() {
        System.out.println("PedidoOnline , prepararPedido"); 
    }
    @Override
    public void validarPagamento() {
         System.out.println("PedidoOnline , validarPagamento"); 
    }
    @Override
    public void despacharPedido() {
        System.out.println("PedidoOnline , despacharPedido");  
    }
    @Override
    public void enviarEmailNotificacao() {
        System.out.println("PedidoOnline , enviarEmailNotificacao");
    }
}
