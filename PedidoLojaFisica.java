class PedidoLojaFisica extends Pedido{
    @Override
    public void prepararPedido() {
       System.out.println("PedidoLojaFisica , prepararPedido");
    }
    @Override
    public void validarPagamento() {
          System.out.println("PedidoLojaFisica , validarPagamento");  
    }
    @Override
    public void despacharPedido() {
         System.out.println("PedidoLojaFisica , despacharPedido"); 
    }
    @Override
    public void enviarEmailNotificacao() {
        System.out.println("PedidoLojaFisica , enviarEmailNotificacao"); 
    }
    @Override
    public void validaestoque() {
         System.out.println("PedidoLojaFisica , validaestoque");  
    }
}