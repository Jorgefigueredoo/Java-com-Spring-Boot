package ListaCoding.ex20;

public class App {

    public static void main(String[] args) {
        System.out.println("--- Demonstração: Liquidificador ---");

        Liquidificador meuLiquidificador = new Liquidificador();

        System.out.println("Tentando bater com o liquidificador desligado:");
        meuLiquidificador.bater("banana e mamão");

        System.out.println("\nAgora, ligando e batendo:");
        meuLiquidificador.ligar();
        meuLiquidificador.bater("banana e mamão");

        System.out.println("\nAumentando a velocidade:");
        meuLiquidificador.definirVelocidade(3);
        meuLiquidificador.bater("gelo");

        System.out.println("\nFinalizando:");
        meuLiquidificador.desligar();
    }
}
