package ListaCoding.ex12;

import java.time.Duration;
import java.time.Instant;

public class Cronometro {

    private Instant startTime;
    private Instant stopTime;
    private boolean running;

    public Cronometro() {
        this.running = false;
    }

    public void iniciar() {
        if (!this.running) {
            this.startTime = Instant.now();
            this.running = true;
            System.out.println("Cronômetro iniciado.");
        } else {
            System.out.println("Cronômetro já está rodando.");
        }
    }

    public void parar() {
        if (this.running) {
            this.stopTime = Instant.now();
            this.running = false;
            System.out.println("Cronômetro parado.");
        } else {
            System.out.println("Cronômetro não está rodando.");
        }
    }

    public void zerar() {
        this.startTime = null;
        this.stopTime = null;
        this.running = false;
        System.out.println("Cronômetro zerado.");
    }

    public String getTempoDecorrido() {
        if (startTime == null) {
            return "0.0 segundos";
        }

        Duration duracao;
        if (running) {

            duracao = Duration.between(startTime, Instant.now());
        } else {

            duracao = Duration.between(startTime, stopTime);
        }

        long segundos = duracao.getSeconds();
        long milissegundos = duracao.toMillisPart();

        return String.format("%d.%03d segundos", segundos, milissegundos);
    }
}
