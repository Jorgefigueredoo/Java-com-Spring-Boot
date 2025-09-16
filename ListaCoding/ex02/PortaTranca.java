package ListaCoding.ex02;

public class PortaTranca {

    private boolean aberta;
    private boolean trancada;

    public PortaTranca() {
        this.aberta = false;
        this.trancada = false;
        System.out.println("PortaComTranca criada. Estado inicial: Fechada, Destrancada.");
    }

    public boolean isAberta() {
        return aberta;
    }

    public boolean isTrancada() {
        return trancada;
    }

    public void abrir() {
        if (trancada) {
            System.out.println("ERRO: Não é possível abrir a porta porque está trancada.");
            return;
        }
        if (aberta) {
            System.out.println("A porta já está aberta.");
            return;
        }
        this.aberta = true;
        System.out.println("Porta aberta com sucesso.");
    }

    public void fechar() {
        if (!aberta) {
            System.out.println("A porta já está fechada.");
            return;
        }
        this.aberta = false;
        System.out.println("Porta fechada com sucesso.");
    }

    public void trancar() {
        if (aberta) {
            System.out.println("ERRO: Não é possível trancar a porta porque está aberta. Feche a porta primeiro.");
            return;
        }
        if (trancada) {
            System.out.println("A porta já está trancada.");
            return;
        }
        this.trancada = true;
        System.out.println("Porta trancada com sucesso.");
    }

    public void destrancar() {
        if (!trancada) {
            System.out.println("A porta já está destrancada.");
            return;
        }
        this.trancada = false;
        System.out.println("Porta destrancada com sucesso.");
    }

    public void exibirEstado() {
        System.out.println("--- Estado Atual da Porta ---");
        System.out.println("Aberta: " + (aberta ? "Sim" : "Não"));
        System.out.println("Trancada: " + (trancada ? "Sim" : "Não"));
        System.out.println("-----------------------------\n");
    }

}
