package ListaCoding.ex19;

public class App {

    public static void main(String[] args) {
        System.out.println("--- Demonstração: Torneira ---");

        Torneira torneiraCozinha = new Torneira();
        Torneira torneiraBanheiro = new Torneira();

        System.out.println("Ajustando torneiras com elas ainda fechadas:");
        torneiraCozinha.regularIntensidade(8);
        torneiraBanheiro.regularIntensidade(4);

        System.out.println("\nAbrindo as torneiras:");
        torneiraCozinha.abrir();
        torneiraBanheiro.abrir();

        System.out.println("\nEstado das torneiras:");
        System.out.println("Cozinha: " + torneiraCozinha.toString());
        System.out.println("Banheiro: " + torneiraBanheiro.toString());
    }
}
