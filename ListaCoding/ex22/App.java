package ListaCoding.ex22;

public class App {

    public static void main(String[] args) {
        System.out.println("--- Demonstração: Forno Elétrico ---");
        FornoEletrico fornoCozinha = new FornoEletrico();
        FornoEletrico fornoGourmet = new FornoEletrico();

        System.out.println("\n--- Forno da Cozinha ---");
        fornoCozinha.ligar();
        fornoCozinha.definirTemperatura(200);
        fornoCozinha.exibirEstado();

        System.out.println("\n--- Forno Gourmet ---");
        fornoGourmet.ligar();
        fornoGourmet.definirTemperatura(150);
        fornoGourmet.exibirEstado();
    }
}
