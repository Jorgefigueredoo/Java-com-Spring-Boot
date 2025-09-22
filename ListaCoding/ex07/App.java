package ListaCoding.ex07;

public class App {

    public static void main(String[] args) {
        System.out.println("--- Demonstração de Termômetros ---");

        TermometroAmbiente termometroSala = new TermometroAmbiente("Sala de Estar");
        termometroSala.mostrarTemperatura();

        TermometroAmbiente termometroCozinha = new TermometroAmbiente("Cozinha");
        termometroCozinha.alterarTemperatura(25.5);

        System.out.println("\n--- Atualizando leituras ---");

        termometroSala.alterarTemperatura(22.5);

        termometroCozinha.mostrarTemperatura();
    }
}
