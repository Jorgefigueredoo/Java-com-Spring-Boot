package ListaCoding.ex16;

public class App {

    public static void main(String[] args) {
        Impressora impressora = new Impressora(5, 10);

        System.out.println("### Demonstração de Impressora ###");
        impressora.mostrarStatus();

        System.out.println(">>> Tentativa de imprimir sem insumo (papel)");
        impressora.imprimir(10);

        System.out.println(">>> Reabastecendo insumos");
        impressora.reabastecerPapel(20);
        impressora.reabastecerTinta(15);
        impressora.mostrarStatus();

        System.out.println(">>> Imprimindo com insumo");
        impressora.imprimir(12);
    }
}
