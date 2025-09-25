package ListaCoding.ex25;

public class CaixaSom {

    private boolean ligada;
    private int volume;
    private int volumeAntesDoMudo;
    private boolean mudo;

    public CaixaSom() {
        this.ligada = false;
        this.volume = 10;
        this.mudo = false;
    }

    public void ligar() {
        this.ligada = true;
        System.out.println("Caixa de som ligada.");
    }

    public void desligar() {
        this.ligada = false;
        System.out.println("Caixa de som desligada.");
    }

    public void setVolume(int volume) {
        if (ligada && volume >= 0 && volume <= 100) {
            this.volume = volume;
            this.mudo = false;
        }
    }

    public void ativarMudo() {
        if (ligada && !mudo) {
            this.volumeAntesDoMudo = this.volume;
            this.volume = 0;
            this.mudo = true;
        }
    }

    public void desativarMudo() {
        if (ligada && mudo) {
            this.volume = this.volumeAntesDoMudo;
            this.mudo = false;
        }
    }

    public void exibirStatus() {
        if (!ligada) {
            System.out.println("Status: Desligada");
            return;
        }
        if (mudo) {
            System.out.println("Status: Mudo ativado (Volume anterior era " + volumeAntesDoMudo + ")");
        } else {
            System.out.println("Status: Ligada | Volume: " + this.volume);
        }
    }
}
