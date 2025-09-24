package ListaCoding.ex18;

public class App {

    public static void main(String[] args) {
        System.out.println("--- Demonstração: Alarme Residencial ---");

        AlarmeResidencial meuAlarme = new AlarmeResidencial();
        meuAlarme.simularEvento();
        meuAlarme.armar();
        meuAlarme.simularEvento();
        meuAlarme.desarmar();
        meuAlarme.simularEvento();
    }
}
