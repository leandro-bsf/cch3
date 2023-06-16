abstract class Pedido {
    public final void processarPedido() {
        validaestoque();
        prepararPedido();
        validarPagamento();
        despacharPedido();
        enviarEmailNotificacao();
    }
    public abstract void validaestoque();
    public abstract void prepararPedido();
    public abstract void validarPagamento();
    public abstract void despacharPedido();
    public abstract void enviarEmailNotificacao();
}
