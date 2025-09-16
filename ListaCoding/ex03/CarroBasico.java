package ListaCoding.ex03;

public class CarroBasico {
    private boolean ligado;
    private int velocidadeAtual;
    private final int VELOCIDADE_MAXIMA = 180;

    public CarroBasico() {
        this.ligado = false;
        this.velocidadeAtual = 0;
        System.out.println("Carro Básico criado. Estado inicial: Desligado, Velocidade: 0 km/h.");
    }

    public boolean isLigado() {
        return ligado;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void ligar() {
        if (ligado) {
            System.out.println("O carro já está ligado.");
            return;
        }
        this.ligado = true;
        System.out.println("Carro ligado.");
    }

    public void desligar() {
        if (!ligado) {
            System.out.println("O carro já está desligado.");
            return;
        }
        this.ligado = false;
        this.velocidadeAtual = 0;
        System.out.println("Carro desligado. Velocidade zerada.");
    }

    public void acelerar(int incremento) {
        if (!ligado) {
            System.out.println("ERRO: Não é possível acelerar. O carro está desligado.");
            return;
        }
        if (incremento <= 0) {
            System.out.println("ERRO: O incremento de aceleração deve ser positivo.");
            return;
        }

        int novaVelocidade = this.velocidadeAtual + incremento;
        if (novaVelocidade > VELOCIDADE_MAXIMA) {
            this.velocidadeAtual = VELOCIDADE_MAXIMA;
            System.out.println("Acelerando... Velocidade máxima atingida: " + VELOCIDADE_MAXIMA + " km/h.");
        } else {
            this.velocidadeAtual = novaVelocidade;
            System.out.println("Acelerando... Velocidade atual: " + this.velocidadeAtual + " km/h.");
        }
    }

    public void frear(int decremento) {
        if (!ligado) {
            System.out.println("ERRO: Não é possível frear. O carro está desligado.");
            return;
        }
        if (decremento <= 0) {
            System.out.println("ERRO: O decremento de frenagem deve ser positivo.");
            return;
        }

        int novaVelocidade = this.velocidadeAtual - decremento;
        if (novaVelocidade < 0) {
            this.velocidadeAtual = 0;
            System.out.println("Freando... Carro parado (0 km/h).");
        } else {
            this.velocidadeAtual = novaVelocidade;
            System.out.println("Freando... Velocidade atual: " + this.velocidadeAtual + " km/h.");
        }
    }

    public void exibirEstado() {
        System.out.println("\n--- Estado Atual do Carro ---");
        System.out.println("Estado: " + (ligado ? "Ligado" : "Desligado"));
        System.out.println("Velocidade: " + velocidadeAtual + " km/h");
        System.out.println("-----------------------------\n");
    }

}