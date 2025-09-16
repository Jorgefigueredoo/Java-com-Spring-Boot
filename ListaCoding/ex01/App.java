package ListaCoding.ex01;

public class App extends LampadaInteligente {
    public static void main(String[] args) {
        LampadaInteligente lampada1 = new LampadaInteligente();
        LampadaInteligente lampada2 = new LampadaInteligente();

        lampada1.alternarEstado();
        lampada1.definirModo("Leitura");
        lampada1.mostrarStatus();

        lampada2.alternarEstado();
        lampada2.definirModo("Relax");
        lampada2.mostrarStatus();

        lampada1.alternarEstado();
        lampada1.mostrarStatus();
    }
}
