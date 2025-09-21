package ListaCoding.ex05;

public class TelevisaoSimples {
    // Exemplo 5: TelevisaoSimples

    private boolean ligada = false;
    private int canal = 1;
    private int volume = 10;

    public void ligarDesligar() {
        this.ligada = !this.ligada;
        System.out.println("TV " + (ligada ? "ligada." : "desligada."));
    }

    public void trocarCanal(int novoCanal) {
        if (ligada && novoCanal > 0) {
            this.canal = novoCanal;
            System.out.println("Canal alterado para: " + this.canal);
        } else {
            System.out.println("A TV está desligada ou o canal é inválido.");
        }
    }

    public void aumentarVolume() {
        if (ligada && volume < 100) {
            this.volume++;
            System.out.println("Volume: " + this.volume);
        }
    }

    public void diminuirVolume() {
        if (ligada && volume > 0) {
            this.volume--;
            System.out.println("Volume: " + this.volume);
        }
    }

    public void mostrarStatus() {
        if (ligada) {
            System.out.println("Status: Ligada | Canal: " + canal + " | Volume: " + volume);
        } else {
            System.out.println("Status: Desligada");
        }
    }
}
