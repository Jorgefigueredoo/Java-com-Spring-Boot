package ListaCoding.ex09;

public class PlayerMusica {

    public static final int PARADO = 0;
    public static final int TOCANDO = 1;
    public static final int PAUSADO = 2;

    private String faixaAtual;
    private int status;

    public PlayerMusica(String faixa) {
        if (faixa == null || faixa.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome da faixa não pode ser vazio.");
        }
        this.faixaAtual = faixa;
        this.status = PARADO;
    }

    public void tocar() {
        if (this.status != TOCANDO) {
            this.status = TOCANDO;
            System.out.println("'" + this.faixaAtual + "' está tocando agora.");
        } else {
            System.out.println("'" + this.faixaAtual + "' já está tocando.");
        }
    }

    public void pausar() {
        if (this.status == TOCANDO) {
            this.status = PAUSADO;
            System.out.println("'" + this.faixaAtual + "' foi pausado.");
        } else {
            System.out.println("Ação inválida. A música não está tocando para ser pausada.");
        }
    }

    public void parar() {
        if (this.status != PARADO) {
            this.status = PARADO;
            System.out.println("'" + this.faixaAtual + "' foi parado.");
        } else {
            System.out.println("A música já está parada.");
        }
    }

    private String getStatusComoTexto() {
        switch (this.status) {
            case PARADO:
                return "PARADO";
            case TOCANDO:
                return "TOCANDO";
            case PAUSADO:
                return "PAUSADO";
            default:
                return "DESCONHECIDO";
        }
    }

    public void mostrarStatus() {
        System.out.println("--- Status do Player ---");
        System.out.println("Faixa: " + this.faixaAtual);
        System.out.println("Estado: " + getStatusComoTexto());
        System.out.println("------------------------");
    }
}
