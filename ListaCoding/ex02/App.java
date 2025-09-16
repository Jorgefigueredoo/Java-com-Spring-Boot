package ListaCoding.ex02;

public class App {
    public static void main(String[] args) {
        System.out.println("--- Cenário 1: Tentativa de abrir trancada ---");
        PortaTranca porta1 = new PortaTranca();
        porta1.exibirEstado();

        porta1.trancar();
        porta1.exibirEstado();

        porta1.abrir();
        porta1.exibirEstado();

        porta1.destrancar();
        porta1.exibirEstado();

        porta1.abrir();
        porta1.exibirEstado();
        porta1.fechar();
        porta1.exibirEstado();

        System.out.println("\n--- Cenário 2: Tentativa de abrir destrancada ---");
        PortaTranca porta2 = new PortaTranca();
        porta2.exibirEstado();

        porta2.abrir();
        porta2.exibirEstado();

        porta2.trancar();
        porta2.exibirEstado();

        porta2.fechar();
        porta2.exibirEstado();

        porta2.trancar();
        porta2.exibirEstado();

        porta2.abrir();
        porta2.exibirEstado();
    }
}
