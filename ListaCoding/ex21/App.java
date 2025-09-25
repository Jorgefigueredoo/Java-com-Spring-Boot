package ListaCoding.ex21;

public class App {

    public static void main(String[] args) {
        System.out.println("--- Demonstração: Pedido de Lanche ---");

        PedidoLanche pedido1 = new PedidoLanche("Médio");
        pedido1.adicionarOpcional("Queijo extra");
        pedido1.adicionarOpcional("Bacon");

        PedidoLanche pedido2 = new PedidoLanche("Grande");
        pedido2.adicionarOpcional("Sem cebola");
        pedido2.adicionarOpcional("Molho especial");

        System.out.println("Pedido 1: " + pedido1.toString());
        System.out.println("Pedido 2: " + pedido2.toString());
    }
}
