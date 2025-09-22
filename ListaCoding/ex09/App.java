package ListaCoding.ex09;

public class App {

    public static void main(String[] args) {
        System.out.println(">>> Criando dois players de música...");
        PlayerMusica player1 = new PlayerMusica("Queen - Bohemian Rhapsody");
        PlayerMusica player2 = new PlayerMusica("Michael Jackson - Billie Jean");

        System.out.println("\n>>> Status Inicial:");
        player1.mostrarStatus();
        player2.mostrarStatus();

        System.out.println("\n>>> Operações no Player 1:");
        player1.tocar();
        player1.pausar();
        player1.tocar();
        player1.parar();
        player1.mostrarStatus();

        System.out.println("\n>>> Operações no Player 2:");
        player2.tocar();
        player2.tocar();
        player2.parar();
        player2.pausar();
        player2.mostrarStatus();
    }
}
