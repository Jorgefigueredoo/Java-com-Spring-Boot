package ListaCoding.ex26;

public class App {

    public static void main(String[] args) {
        System.out.println("--- Demonstração: Caixa Registradora ---");
        CaixaRegistradora caixa1 = new CaixaRegistradora(1);
        CaixaRegistradora caixa2 = new CaixaRegistradora(2);

        System.out.println("\nRealizando vendas...");
        caixa1.adicionarVenda(50.25);
        caixa2.adicionarVenda(120.00);
        caixa1.adicionarVenda(15.50);
        caixa2.adicionarVenda(35.10);
        caixa1.adicionarVenda(8.00);

        System.out.println("\n--- Fim do Expediente ---");
        caixa1.fecharCaixa();
        caixa2.fecharCaixa();
    }
}
