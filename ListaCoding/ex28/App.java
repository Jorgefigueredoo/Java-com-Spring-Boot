package ListaCoding.ex28;

public class App {

    public static void main(String[] args) {
        SensorPresença meuSensor = new SensorPresença();

        System.out.println("--- Testando com sensor inativo ---");
        meuSensor.detectar();

        System.out.println("\n--- Testando com sensor ativo ---");
        meuSensor.ativar();
        meuSensor.detectar();

        System.out.println("\n--- Desativando o sensor ---");
        meuSensor.desativar();
        meuSensor.detectar();
    }
}
