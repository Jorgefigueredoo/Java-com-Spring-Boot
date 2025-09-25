package ListaCoding.ex29;

public class App {

    public static void main(String[] args) {
        TanqueDeAgua meuTanque = new TanqueDeAgua(100.0, 50.0);

        System.out.println("--- Estado Inicial ---");
        meuTanque.imprimirNivel();

        System.out.println("\n--- Tentando esvaziar além do mínimo ---");
        meuTanque.esvaziar(60.0);

        System.out.println("\n--- Esvaziando uma quantidade válida ---");
        meuTanque.esvaziar(20.0);

        System.out.println("\n--- Enchendo até o máximo ---");
        meuTanque.encher(200.0);
    }
}
