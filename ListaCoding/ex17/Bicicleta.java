package ListaCoding.ex17;

public class Bicicleta {
    private int marcha;

    public Bicicleta() {
        this.marcha = 1;
    }

    public void aumentarMarcha() {
        this.marcha++;
        System.out.println("Marcha aumentada para: " + this.marcha);
    }

    public void diminuirMarcha() {
        if (this.marcha > 1) {
            this.marcha--;
            System.out.println("Marcha diminuída para: " + this.marcha);
        } else {
            System.out.println("Já está na menor marcha.");
        }
    }

    public void pedalar() {
        System.out.println(
                "Pedalando na marcha " + this.marcha + ". Quanto maior a marcha, maior o esforço e a velocidade.");
    }
}