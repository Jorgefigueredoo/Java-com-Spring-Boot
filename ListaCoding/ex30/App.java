package ListaCoding.ex30;

public class App {
    public static void main(String[] args) {
        Computador meuPC = new Computador();

        meuPC.verificarEstado();

        System.out.println("\n1. Ligando e abrindo aplicativos...");
        meuPC.ligar();
        meuPC.abrirAplicativo("Navegador Web");
        meuPC.verificarEstado();

        meuPC.abrirAplicativo("Editor de Texto");
        meuPC.verificarEstado();

        System.out.println("\n2. Reiniciando o computador...");
        meuPC.reiniciar();

        System.out.println("\n3. Verificando estado após reiniciar...");
        meuPC.verificarEstado();
    }
}
