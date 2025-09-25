package ListaCoding.ex22;

public class FornoEletrico {

    private boolean ligado;
    private int temperaturaAlvo;
    private int temperaturaAtual;

    public FornoEletrico() {
        this.ligado = false;
        this.temperaturaAtual = 20;
        this.temperaturaAlvo = 20;
    }

    public void ligar() {
        this.ligado = true;
        System.out.println("Forno ligado.");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("Forno desligado. Esfriando...");
    }

    public void definirTemperatura(int temperatura) {
        if (ligado) {
            this.temperaturaAlvo = temperatura;
            System.out.println("Temperatura alvo definida para " + temperatura + "°C.");
            aquecer();
        } else {
            System.out.println("Não é possível definir a temperatura, o forno está desligado.");
        }
    }

    private void aquecer() {
        if (ligado && temperaturaAtual < temperaturaAlvo) {
            temperaturaAtual += 50;
            if (temperaturaAtual > temperaturaAlvo) {
                temperaturaAtual = temperaturaAlvo;
            }
        }
    }

    public void exibirEstado() {
        if (ligado) {
            System.out.println(
                    "Estado: Ligado | Temp. Atual: " + temperaturaAtual + "°C | Temp. Alvo: " + temperaturaAlvo + "°C");
            if (temperaturaAtual < temperaturaAlvo) {
                System.out.println("Status: Aquecendo...");
            } else {
                System.out.println("Status: Temperatura alvo atingida.");
            }
        } else {
            System.out.println("Estado: Desligado | Temp. Atual: " + temperaturaAtual + "°C");
        }
    }
}
