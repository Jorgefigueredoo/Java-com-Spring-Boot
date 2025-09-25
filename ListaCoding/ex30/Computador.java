package ListaCoding.ex30;

public class Computador {

    private boolean ligado;
    private String aplicativoAtivo;

    public Computador() {
        this.ligado = false;
        this.aplicativoAtivo = "Nenhum";
    }

    public void ligar() {
        if (!ligado) {
            this.ligado = true;
            System.out.println("Computador ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            this.ligado = false;
            this.aplicativoAtivo = "Nenhum";
            System.out.println("Computador desligado.");
        }
    }

    public void reiniciar() {
        System.out.println("Reiniciando...");
        desligar();
        ligar();
        System.out.println("Computador reiniciado.");
    }

    public void abrirAplicativo(String nomeApp) {
        if (ligado) {
            this.aplicativoAtivo = nomeApp;
            System.out.println("Aplicativo '" + nomeApp + "' foi aberto.");
        } else {
            System.out.println("Não é possível abrir aplicativo, o computador está desligado.");
        }
    }

    public void verificarEstado() {
        System.out.println("--- Estado do Computador ---");
        System.out.println("Ligado: " + (ligado ? "Sim" : "Não"));
        System.out.println("Aplicativo Ativo: " + aplicativoAtivo);
        System.out.println("----------------------------");
    }
}
