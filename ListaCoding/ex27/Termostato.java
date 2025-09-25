package ListaCoding.ex27;

public class Termostato {

    private int temperaturaDesejada;
    private int temperaturaAtual;

    public Termostato(int temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaDesejada = temperaturaAtual;
    }

    public void setTemperaturaDesejada(int temperatura) {
        this.temperaturaDesejada = temperatura;
        System.out.println("Temperatura desejada ajustada para " + temperatura + "°C.");
    }

    public void exibirStatus() {
        System.out.print(
                "Status: Temp. Atual: " + temperaturaAtual + "°C | Temp. Desejada: " + temperaturaDesejada + "°C.");
        if (temperaturaAtual < temperaturaDesejada) {
            System.out.println(" -> AQUECENDO...");
        } else if (temperaturaAtual > temperaturaDesejada) {
            System.out.println(" -> RESFRIANDO...");
        } else {
            System.out.println(" -> Temperatura estável.");
        }
    }
}
