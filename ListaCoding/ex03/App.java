package ListaCoding.ex03;

public class App {
    public static void main(String[] args) {
        System.out.println("### Demonstração de Carros Básicos ###\n");

        System.out.println("--- Carro 1: Passeio Tranquilo ---");
        CarroBasico carro1 = new CarroBasico();
        carro1.exibirEstado();

        carro1.acelerar(10);
        carro1.ligar();
        carro1.exibirEstado();

        carro1.acelerar(30);
        carro1.acelerar(20);
        carro1.frear(10);
        carro1.exibirEstado();

        carro1.desligar();
        carro1.exibirEstado();

        System.out.println("--- Carro 2: Teste de Limites ---");
        CarroBasico carro2 = new CarroBasico();
        carro2.exibirEstado();

        carro2.ligar();
        carro2.exibirEstado();

        carro2.acelerar(80);
        carro2.acelerar(70);
        carro2.acelerar(40);
        carro2.exibirEstado();

        carro2.frear(50);
        carro2.frear(100);
        carro2.frear(50);
        carro2.exibirEstado();

        carro2.desligar();
        carro2.exibirEstado();
    }
}
