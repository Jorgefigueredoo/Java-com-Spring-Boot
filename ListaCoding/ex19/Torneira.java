package ListaCoding.ex19;

public class Torneira {

    private boolean aberta;
    private int intensidadeFluxo;

    public Torneira() {
        this.aberta = false;
        this.intensidadeFluxo = 0;
    }

    public void abrir() {
        this.aberta = true;
        if (this.intensidadeFluxo == 0) {
            this.intensidadeFluxo = 5;
        }
        System.out.println("Torneira aberta com fluxo " + this.intensidadeFluxo + ".");
    }

    public void fechar() {
        this.aberta = false;
        System.out.println("Torneira fechada.");
    }

    public void regularIntensidade(int intensidade) {
        if (intensidade >= 0 && intensidade <= 10) {
            this.intensidadeFluxo = intensidade;
            if (this.aberta) {
                System.out.println("Fluxo de água regulado para " + this.intensidadeFluxo + ".");
            } else {
                System.out.println("Intensidade pré-ajustada para " + this.intensidadeFluxo + ".");
            }
        } else {
            System.out.println("Intensidade inválida. Use um valor entre 0 e 10.");
        }
    }

    @Override
    public String toString() {
        return "Torneira [aberta=" + aberta + ", intensidadeFluxo=" + intensidadeFluxo + "]";
    }
}
