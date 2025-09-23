package ListaCoding.ex10;

public class App {

    public static void main(String[] args) {
        System.out.println(">>> Criando um elevador para um prédio de 12 andares (0 a 12).");
        ElevadorPredio elevador = new ElevadorPredio(0, 12);
        elevador.mostrarStatus();

        System.out.println("\n>>> Subindo até o topo...");
        for (int i = 0; i < 13; i++) {
            elevador.subir();
        }

        System.out.println("\n>>> Tentando subir além do limite:");
        elevador.subir();
        elevador.mostrarStatus();

        System.out.println("\n>>> Descendo até o térreo...");
        for (int i = 0; i < 13; i++) {
            elevador.descer();
        }

        System.out.println("\n>>> Tentando descer além do limite:");
        elevador.descer();
        elevador.mostrarStatus();
    }
}
