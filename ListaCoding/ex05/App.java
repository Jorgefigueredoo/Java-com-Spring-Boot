package ListaCoding.ex05;

public class App {
    public static void main(String[] args) {
        System.out.println("--- Demonstração TV 1 (Sala) ---");
        TelevisaoSimples tvSala = new TelevisaoSimples();
        tvSala.ligarDesligar();
        tvSala.trocarCanal(10);
        tvSala.aumentarVolume();
        tvSala.aumentarVolume();
        tvSala.mostrarStatus();

        System.out.println("\n--- Demonstração TV 2 (Quarto) ---");
        TelevisaoSimples tvQuarto = new TelevisaoSimples();
        tvQuarto.ligarDesligar();
        tvQuarto.trocarCanal(5);
        for (int i = 0; i < 5; i++) {
            tvQuarto.diminuirVolume();
        }
        tvQuarto.mostrarStatus();
    }
}
