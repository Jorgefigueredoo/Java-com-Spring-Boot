package ListaCoding.ex13;

public class MaquinaCafe {

    private int agua;
    private int cafe;
    private int copos;

    public MaquinaCafe(int agua, int cafe, int copos) {
        this.agua = agua;
        this.cafe = cafe;
        this.copos = copos;
    }

    public void prepararBebida(String tipo) {
        System.out.println("Tentando preparar: " + tipo);
        if (temRecursosSuficientes()) {
            this.agua -= 1;
            this.cafe -= 1;
            this.copos -= 1;
            System.out.println(tipo + " preparado com sucesso!");
        } else {
            System.out.println("Falha! Recursos insuficientes para preparar a bebida.");
        }
        mostrarStatus();
    }

    private boolean temRecursosSuficientes() {
        return this.agua > 0 && this.cafe > 0 && this.copos > 0;
    }

    public void mostrarStatus() {
        System.out.println("[Status: Água=" + agua + ", Café=" + cafe + ", Copos=" + copos + "]");
        System.out.println("---");
    }
}
