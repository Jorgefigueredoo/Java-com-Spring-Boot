package ListaCoding.ex20;

public class Liquidificador {

    private boolean ligado;
    private int velocidade;

    public Liquidificador() {
        this.ligado = false;
        this.velocidade = 0;
    }

    public void ligar() {
        this.ligado = true;
        this.velocidade = 1;
        System.out.println("Liquidificador ligado na velocidade 1.");
    }

    public void desligar() {
        this.ligado = false;
        this.velocidade = 0;
        System.out.println("Liquidificador desligado.");
    }

    public void definirVelocidade(int velocidade) {
        if (this.ligado) {
            if (velocidade > 0 && velocidade <= 5) {
                this.velocidade = velocidade;
                System.out.println("Velocidade definida para " + this.velocidade + ".");
            } else {
                System.out.println("Velocidade inválida.");
            }
        } else {
            System.out.println("Não é possível definir a velocidade, o liquidificador está desligado.");
        }
    }

    public void bater(String alimento) {
        if (this.ligado) {
            System.out.println("Batendo " + alimento + " na velocidade " + this.velocidade + "...");
        } else {
            System.out.println("Não é possível bater, o liquidificador está desligado.");
        }
    }
}
