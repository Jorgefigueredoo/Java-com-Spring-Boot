package ListaCoding.ex29;

public class TanqueDeAgua {

    private double nivelAtual;
    private double capacidadeMaxima;
    private final double NIVEL_MINIMO = 0.0;

    public TanqueDeAgua(double capacidadeMaxima, double nivelInicial) {
        this.capacidadeMaxima = capacidadeMaxima;
        this.nivelAtual = Math.min(nivelInicial, capacidadeMaxima);
    }

    public void encher(double quantidade) {
        if (quantidade <= 0)
            return;

        this.nivelAtual += quantidade;
        if (this.nivelAtual > this.capacidadeMaxima) {
            this.nivelAtual = this.capacidadeMaxima;
            System.out.println("Tanque cheio. Nível ajustado para o máximo.");
        }
        imprimirNivel();
    }

    public void esvaziar(double quantidade) {
        if (quantidade <= 0)
            return;

        if (this.nivelAtual - quantidade < NIVEL_MINIMO) {
            System.out.println("Operação bloqueada: tentativa de esvaziar além do mínimo.");
        } else {
            this.nivelAtual -= quantidade;
        }
        imprimirNivel();
    }

    public void imprimirNivel() {
        System.out.printf("Nível atual: %.2f litros.%n", this.nivelAtual);
    }
}
