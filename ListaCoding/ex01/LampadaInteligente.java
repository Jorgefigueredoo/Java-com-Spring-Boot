package ListaCoding.ex01;

public class LampadaInteligente {
    private boolean ligada;
    private String modo;

    public LampadaInteligente() {
        this.ligada = false;
        this.modo = "desligada";
    }

    public void alternarEstado() {
        this.ligada = !this.ligada;
        if (!ligada) {
            this.modo = "desligada";
        }
    }

    public void definirModo(String novoModo) {
        if (ligada) {
            this.modo = novoModo;
        } else {
            System.out.println("Não é possível alterar o modo. A lâmpada está desligada.");
        }
    }

    public void mostrarStatus() {
        System.out.println("Lâmpada " + (ligada ? "ligada" : "desligada") + " | Modo: " + modo);
    }
}
