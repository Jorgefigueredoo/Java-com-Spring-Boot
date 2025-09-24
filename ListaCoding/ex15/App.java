package ListaCoding.ex15;

public class App {

    public static void main(String[] args) {
        Semaforo cruzamentoA = new Semaforo();
        Semaforo cruzamentoB = new Semaforo();

        System.out.println("### Demonstração de Semáforos Independentes ###\n");

        System.out.println("Ciclo completo do Cruzamento A:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Cruzamento A: " + cruzamentoA.getEstadoAtual());
            cruzamentoA.avancar();
        }
        System.out.println("---\n");

        System.out.println("Ciclos independentes:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Ciclo %d -> Cruzamento A: %-8s | Cruzamento B: %s\n",
                    i + 1,
                    cruzamentoA.getEstadoAtual(),
                    cruzamentoB.getEstadoAtual());

            cruzamentoA.avancar();
            if (i % 2 == 0) {
                cruzamentoB.avancar();
            }
        }
    }
}
