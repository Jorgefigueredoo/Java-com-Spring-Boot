package ListaCoding.ex13;

public class App {
    public class DemoMaquinaDeCafe {

        public static void main(String[] args) {
            MaquinaCafe maquina = new MaquinaCafe(1, 2, 2);

            System.out.println("### Demonstração de Máquina de Café ###");
            maquina.mostrarStatus();

            System.out.println(">>> Preparo Válido");
            maquina.prepararBebida("Café Expresso");

            System.out.println(">>> Caso Sem Recurso Suficiente (água)");
            maquina.prepararBebida("Café Longo");
        }
    }
}
