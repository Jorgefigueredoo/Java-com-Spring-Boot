package ListaCoding.ex17;

public class App {

    public static void main(String[] args) {
        System.out.println("--- Demonstração: Bicicleta ---");

        Bicicleta minhaBicicleta = new Bicicleta();
        minhaBicicleta.pedalar();
        minhaBicicleta.aumentarMarcha();
        minhaBicicleta.aumentarMarcha();
        minhaBicicleta.pedalar();
        minhaBicicleta.diminuirMarcha();
        minhaBicicleta.pedalar();
    }
}
