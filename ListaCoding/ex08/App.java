package ListaCoding.ex08;

public class App {

    public static void main(String[] args) {

        System.out.println("--- Criando dois relógios com horários distintos ---");

        RelogioDigital relogio1 = new RelogioDigital(10, 30);
        System.out.println("Horário inicial do Relógio 1: " + relogio1.getHorarioFormatado());

        RelogioDigital relogio2 = new RelogioDigital(22, 15);
        System.out.println("Horário inicial do Relógio 2: " + relogio2.getHorarioFormatado());

        System.out.println("\n--- Realizando ajustes nos horários ---");

        relogio1.ajustarHorario(11, 45);
        System.out.println("Novo horário do Relógio 1 após ajuste: " + relogio1.getHorarioFormatado());

        relogio2.ajustarHorario(7, 5);
        System.out.println("Novo horário do Relógio 2 após ajuste: " + relogio2.getHorarioFormatado());

        try {
            System.out.println("\n--- Tentando ajustar para um horário inválido ---");
            relogio1.ajustarHorario(25, 70);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao tentar ajustar o Relógio 1: " + e.getMessage());
        }
    }

}
