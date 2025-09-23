package ListaCoding.ex12;

public class App {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("### DEMONSTRAÇÃO DE DOIS CRONÔMETROS INDEPENDENTES ###\n");

        Cronometro c1 = new Cronometro();
        Cronometro c2 = new Cronometro();

        System.out.println("--- Iniciando Medição 1 ---");
        c1.iniciar();

        Thread.sleep(2000);

        System.out.println("Tempo decorrido (c1 em andamento): " + c1.getTempoDecorrido());

        c1.parar();
        System.out.println("Tempo final (c1 parado): " + c1.getTempoDecorrido());
        System.out.println("---------------------------\n");

        System.out.println("--- Iniciando Medição 2 ---");
        c2.iniciar();

        Thread.sleep(3000);

        c2.parar();
        System.out.println("Tempo final (c2 parado): " + c2.getTempoDecorrido());
        System.out.println("---------------------------\n");

        System.out.println("--- Zerando c1 ---");
        System.out.println("Tempo de c1 antes de zerar: " + c1.getTempoDecorrido());
        c1.zerar();
        System.out.println("Tempo de c1 após zerar: " + c1.getTempoDecorrido());
    }
}
