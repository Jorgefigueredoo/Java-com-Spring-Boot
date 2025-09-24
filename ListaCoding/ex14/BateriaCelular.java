package ListaCoding.ex14;

public class BateriaCelular {

    private int carga;

    public BateriaCelular() {
        this.carga = 100;
    }

    public void consumir(int quantidade) {
        this.carga -= quantidade;
        if (this.carga < 0) {
            this.carga = 0;
        }
        System.out.println("Consumindo " + quantidade + "%. Carga atual: " + this.carga + "%");
    }

    public void carregar(int quantidade) {
        this.carga += quantidade;
        if (this.carga > 100) {
            this.carga = 100;
        }
        System.out.println("Carregando " + quantidade + "%. Carga atual: " + this.carga + "%");
    }

    public int getCarga() {
        return this.carga;
    }
}
