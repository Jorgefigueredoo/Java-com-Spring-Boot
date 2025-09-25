package ListaCoding.ex25;

public class App {

    public static void main(String[] args) {
        System.out.println("--- Demonstração: Caixa de Som ---");
        CaixaSom minhaCaixa = new CaixaSom();
        minhaCaixa.ligar();

        System.out.println("\nVolume em 50:");
        minhaCaixa.setVolume(50);
        minhaCaixa.exibirStatus();

        System.out.println("\nVolume em 0 (não é mudo):");
        minhaCaixa.setVolume(0);
        minhaCaixa.exibirStatus();

        System.out.println("\nVoltando o volume para 50 e ativando o mudo:");
        minhaCaixa.setVolume(50);
        minhaCaixa.exibirStatus();
        minhaCaixa.ativarMudo();
        minhaCaixa.exibirStatus();

        System.out.println("\nDesativando o mudo (volume deve voltar a 50):");
        minhaCaixa.desativarMudo();
        minhaCaixa.exibirStatus();
    }
}
