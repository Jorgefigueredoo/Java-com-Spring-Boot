package ListaCoding.ex08;

public class RelogioDigital {

    private int hora;
    private int minuto;

    public RelogioDigital(int hora, int minuto) {

        this.ajustarHorario(hora, minuto);
    }

    public void ajustarHorario(int novaHora, int novoMinuto) {
        if (novaHora >= 0 && novaHora <= 23 && novoMinuto >= 0 && novoMinuto <= 59) {
            this.hora = novaHora;
            this.minuto = novoMinuto;
        } else {

            throw new IllegalArgumentException("Horário inválido. A hora deve ser de 0-23 e o minuto de 0-59.");
        }
    }

    public String getHorarioFormatado() {
        return String.format("%02d:%02d", this.hora, this.minuto);
    }
}
