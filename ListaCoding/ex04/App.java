package ListaCoding.ex04;

public class App {

    public static void main(String[] args) {

        System.out.println("Demonstração Básica do ventilado");

        System.out.println("Ventilador 1: ");
        VentiladordeMesa ventilador1 = new VentiladordeMesa();

        ventilador1.exibirResultados();

        ventilador1.aumentarVelocidade(10);
        ventilador1.ligar();
        ventilador1.exibirResultados();

        ventilador1.aumentarVelocidade(15);
        ventilador1.aumentarVelocidade(5);
        ventilador1.diminuirVelocidade(12);

        ventilador1.exibirResultados();

        ventilador1.desligar();
        ventilador1.exibirResultados();

        System.out.println("Demonstração Básica do ventilado");

        System.out.println("Ventilador 2: ");
        VentiladordeMesa ventilador2 = new VentiladordeMesa();

        ventilador2.exibirResultados();

        ventilador2.aumentarVelocidade(10);
        ventilador2.ligar();
        ventilador2.exibirResultados();

        ventilador2.aumentarVelocidade(15);
        ventilador2.aumentarVelocidade(30);
        ventilador2.diminuirVelocidade(12);

        ventilador2.exibirResultados();

        ventilador2.desligar();
        ventilador2.exibirResultados();
    }
}
