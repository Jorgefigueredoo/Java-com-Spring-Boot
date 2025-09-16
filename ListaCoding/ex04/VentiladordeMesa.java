package ListaCoding.ex04;

public class VentiladordeMesa {

    private boolean ligado;
    private int velocidadeAtual;
    private final int VELOCIDADE_MAXIMA = 40;

    public VentiladordeMesa() {
        this.ligado = false;
        this.velocidadeAtual = 0;
    }

    public boolean isLigado() {
        return ligado;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void ligar() {
        if (ligado) {
            System.out.println("O ventilado já está ligado");
            return;
        }
        this.ligado = true;
        System.out.println("Veentilador ligado");
    }

    public void desligar() {
        if (!ligado) {
            System.out.println("O ventilador já est;a desligado");
            return;
        }
        this.ligado = false;
        System.out.println("Ventilador desligado");
    }

    public void aumentarVelocidade(int incremento) {
        if (!ligado) {
            System.out.println("Erro ao aumentar a velocidade,o ventilador está desligado");
            return;
        }
        if (incremento <= 0) {
            System.err.println("O valor do incremento tem que ser postivo");
        }

        int novaVelocidade = this.velocidadeAtual + incremento;

        if (novaVelocidade > VELOCIDADE_MAXIMA) {
            System.out.println("Aumentando velocidade... Velocidade máxima atingida" + VELOCIDADE_MAXIMA + "km/h");
        } else {
            this.velocidadeAtual = novaVelocidade;
            System.out.println("aumentando velocidade... Velocidade atual: " + this.velocidadeAtual + "km/h");
        }
    }

    public void diminuirVelocidade(int decremento) {
        if (!ligado) {
            System.out.println("Erro ao deiminuir a velocidade, o carro está delsigado");
            return;
        }
        if (decremento <= 0) {
            System.out.println("O valor do drecremento tem que ser postivo");
            return;
        }

        int novaVelocidade = this.velocidadeAtual - decremento;
        if (novaVelocidade < 0) {
            System.out.println("Ventilado diminuando velocidade... Ventilador desligado");
        } else {
            this.velocidadeAtual = novaVelocidade;
            System.out
                    .println("Ventilador diminuando velocidade... Velocidade atual: " + this.velocidadeAtual + "km/h");
        }
    }

}
