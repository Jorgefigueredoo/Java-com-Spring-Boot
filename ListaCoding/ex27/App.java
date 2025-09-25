package ListaCoding.ex27;

public class App {

    public static void main(String[] args) {
        System.out.println("--- Demonstração: Termostato ---");
        Termostato sala = new Termostato(25);
        Termostato quarto = new Termostato(18);

        System.out.println("\n-- Ambiente da Sala --");
        sala.exibirStatus();
        sala.setTemperaturaDesejada(22);
        sala.exibirStatus();

        System.out.println("\n-- Ambiente do Quarto --");
        quarto.exibirStatus();
        quarto.setTemperaturaDesejada(21);
        quarto.exibirStatus();
    }

}
