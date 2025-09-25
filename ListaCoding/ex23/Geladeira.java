package ListaCoding.ex23;

public class Geladeira {

    private int temperaturaInterna;
    private boolean portaAberta;

    public Geladeira() {
        this.temperaturaInterna = 5;
        this.portaAberta = false;
    }

    public void ajustarTemperatura(int temperatura) {
        this.temperaturaInterna = temperatura;
        System.out.println("Temperatura ajustada para " + temperatura + "°C.");
    }

    public void abrirPorta() {
        this.portaAberta = true;
        System.out.println("Porta da geladeira foi aberta.");
    }

    public void fecharPorta() {
        this.portaAberta = false;
        System.out.println("Porta da geladeira foi fechada.");
    }

    public void exibirStatus() {
        System.out.print("Status: " + temperaturaInterna + "°C. Porta " + (portaAberta ? "Aberta" : "Fechada") + ".");
        if (portaAberta) {
            System.out.println(" - ATENÇÃO: Motor trabalhando mais para manter a temperatura!");
        } else {
            System.out.println(" - Operação normal.");
        }
    }
}
