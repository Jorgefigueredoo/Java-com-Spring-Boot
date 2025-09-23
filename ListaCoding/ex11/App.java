package ListaCoding.ex11;

public class App {

    public static void main(String[] args) {

        ControleVolume controle = new ControleVolume(0, 10, 5);
        System.out.println("Volume inicial: " + controle.getVolume());
        System.out.println("------------------------------------");

        System.out.println(">>> Aumentando volume...");
        for (int i = 0; i < 7; i++) {
            controle.aumentarVolume();
        }

        System.out.println("------------------------------------");
        System.out.println("Volume atual: " + controle.getVolume());
        System.out.println("------------------------------------");

        System.out.println(">>> Diminuindo volume...");
        for (int i = 0; i < 12; i++) {
            controle.diminuirVolume();
        }

        System.out.println("------------------------------------");
        System.out.println("Volume final: " + controle.getVolume());
    }
}
