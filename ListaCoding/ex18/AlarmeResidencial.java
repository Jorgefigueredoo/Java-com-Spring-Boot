package ListaCoding.ex18;

public class AlarmeResidencial {

    private boolean armado;

    public AlarmeResidencial() {
        this.armado = false;
    }

    public void armar() {
        this.armado = true;
        System.out.println("Alarme armado.");
    }

    public void desarmar() {
        this.armado = false;
        System.out.println("Alarme desarmado.");
    }

    public void simularEvento() {
        System.out.println("Movimento detectado...");
        if (this.armado) {
            System.out.println("ALERTA! Invasão detectada! Alarme disparado!");
        } else {
            System.out.println("Nenhuma ação necessária, alarme desarmado.");
        }
    }
}
