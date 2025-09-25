package ListaCoding.ex23;

public class App {

    public static void main(String[] args) {
        System.out.println("--- Demonstração: Geladeira ---");
        Geladeira minhaGeladeira = new Geladeira();

        System.out.println("\nVerificando o estado inicial:");
        minhaGeladeira.exibirStatus();

        System.out.println("\nAbrindo a porta:");
        minhaGeladeira.abrirPorta();
        minhaGeladeira.exibirStatus();

        System.out.println("\nFechando a porta:");
        minhaGeladeira.fecharPorta();
        minhaGeladeira.exibirStatus();
    }
}
