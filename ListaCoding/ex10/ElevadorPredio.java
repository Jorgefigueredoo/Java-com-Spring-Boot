package ListaCoding.ex10;

public class ElevadorPredio {

    private int andarAtual;
    private final int andarMaximo;
    private final int andarMinimo;

    public ElevadorPredio(int andarMinimo, int andarMaximo) {
        if (andarMinimo >= andarMaximo) {
            throw new IllegalArgumentException("O andar máximo deve ser maior que o andar mínimo.");
        }
        this.andarMinimo = andarMinimo;
        this.andarMaximo = andarMaximo;
        this.andarAtual = andarMinimo;
    }

    public void subir() {
        if (this.andarAtual < this.andarMaximo) {
            this.andarAtual++;
            System.out.println("Subindo... agora no " + this.andarAtual + "º andar.");
        } else {
            System.out.println("AVISO: O elevador já está no último andar (" + this.andarMaximo + "º).");
        }
    }

    public void descer() {
        if (this.andarAtual > this.andarMinimo) {
            this.andarAtual--;
            if (this.andarAtual == 0) {
                System.out.println("Descendo... agora no Térreo.");
            } else {
                System.out.println("Descendo... agora no " + this.andarAtual + "º andar.");
            }
        } else {
            if (this.andarMinimo == 0) {
                System.out.println("AVISO: O elevador já está no Térreo.");
            } else {
                System.out.println("AVISO: O elevador já está no andar mais baixo (" + this.andarMinimo + "º).");
            }
        }
    }

    public void mostrarStatus() {
        if (this.andarAtual == 0) {
            System.out.println("O elevador está parado no Térreo.");
        } else {
            System.out.println("O elevador está parado no " + this.andarAtual + "º andar.");
        }
    }
}
