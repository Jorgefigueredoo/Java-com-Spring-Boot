package ListaCoding.ex16;

public class Impressora {

    private int papel;
    private int tinta;

    public Impressora(int papel, int tinta) {
        this.papel = papel;
        this.tinta = tinta;
    }

    public void imprimir(int paginas) {
        System.out.println("Tentando imprimir " + paginas + " páginas.");
        if (papel >= paginas && tinta >= paginas) {
            this.papel -= paginas;
            this.tinta -= paginas;
            System.out.println("Impressão realizada com sucesso.");
        } else {
            System.out.println("Falha na impressão: insumos insuficientes.");
        }
        mostrarStatus();
    }

    public void reabastecerPapel(int quantidade) {
        this.papel += quantidade;
        System.out.println(quantidade + " folhas de papel adicionadas.");
    }

    public void reabastecerTinta(int quantidade) {
        this.tinta += quantidade;
        System.out.println(quantidade + " de tinta adicionada.");
    }

    public void mostrarStatus() {
        System.out.println("[Status: Papel=" + papel + ", Tinta=" + tinta + "]");
        System.out.println("---");
    }
}
