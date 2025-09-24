package ListaCoding.ex15;

public class Semaforo {

    public static final String VERMELHO = "VERMELHO";
    public static final String AMARELO = "AMARELO";
    public static final String VERDE = "VERDE";

    private String estadoAtual;

    public Semaforo() {
        this.estadoAtual = VERMELHO;
    }

    public void avancar() {
        switch (estadoAtual) {
            case VERMELHO:
                this.estadoAtual = VERDE;
                break;
            case VERDE:
                this.estadoAtual = AMARELO;
                break;
            case AMARELO:
                this.estadoAtual = VERMELHO;
                break;
        }
    }

    public String getEstadoAtual() {
        return this.estadoAtual;
    }
}
