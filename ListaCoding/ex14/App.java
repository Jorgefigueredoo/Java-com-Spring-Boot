package ListaCoding.ex14;

public class App {
    public class DemoBateriaDeCelular {

        public static void main(String[] args) {
            BateriaCelular bateria = new BateriaCelular();

            System.out.println("### Demonstração de Bateria de Celular ###");
            System.out.println("Carga inicial: " + bateria.getCarga() + "%");
            System.out.println("---");

            System.out.println(">>> Consumo até quase esgotar");
            bateria.consumir(30);
            bateria.consumir(50);
            bateria.consumir(15);
            System.out.println("---");

            System.out.println(">>> Recarga");
            bateria.carregar(20);
            bateria.carregar(70);
            bateria.carregar(10);
        }
    }
}
