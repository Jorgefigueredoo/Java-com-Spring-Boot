package ListaCoding.ex07;

public class TermometroAmbiente {

    private double temperaturaCelsius;
    private String localizacao;

    public TermometroAmbiente(String localizacao) {
        this.localizacao = localizacao;
        this.temperaturaCelsius = 20.0; // Temperatura padrão inicial
    }

    public void mostrarTemperatura() {
        System.out.println(
                "Temperatura no(a) " + this.localizacao + ": " + String.format("%.1f", this.temperaturaCelsius) + "°C");
    }

    public void alterarTemperatura(double novaTemperatura) {
        this.temperaturaCelsius = novaTemperatura;
        System.out.println("Temperatura do(a) " + this.localizacao + " atualizada.");
        mostrarTemperatura();
    }
}
