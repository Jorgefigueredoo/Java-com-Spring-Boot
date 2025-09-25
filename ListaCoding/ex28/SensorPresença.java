package ListaCoding.ex28;

public class SensorPresença {

    private boolean ativo;

    public SensorPresença() {
        this.ativo = false;
    }

    public void ativar() {
        this.ativo = true;
        System.out.println("Sensor ativado.");
    }

    public void desativar() {
        this.ativo = false;
        System.out.println("Sensor desativado.");
    }

    public void detectar() {
        if (ativo) {
            System.out.println("Presença detectada.");
        } else {
            System.out.println("Sensor inativo, impossível detectar.");
        }
    }
}
