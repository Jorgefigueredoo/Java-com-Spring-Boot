package ListaCoding.ex11;

public class ControleVolume {

    private int volume;
    private final int minimo;
    private final int maximo;

    public ControleVolume(int minimo, int maximo, int volumeInicial) {
        this.minimo = minimo;
        this.maximo = maximo;

        if (volumeInicial > maximo) {
            this.volume = maximo;
        } else if (volumeInicial < minimo) {
            this.volume = minimo;
        } else {
            this.volume = volumeInicial;
        }
    }

    public void aumentarVolume() {
        if (this.volume < this.maximo) {
            this.volume++;
            System.out.println("Volume aumentado para: " + this.volume);
        } else {
            System.out.println("Volume já está no máximo (" + this.maximo + ").");
        }
    }

    public void diminuirVolume() {
        if (this.volume > this.minimo) {
            this.volume--;
            System.out.println("Volume diminuído para: " + this.volume);
        } else {
            System.out.println("Volume já está no mínimo (" + this.minimo + ").");
        }
    }

    public int getVolume() {
        return this.volume;
    }
}
