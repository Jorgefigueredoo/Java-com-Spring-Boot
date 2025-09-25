package ListaCoding.ex26;

public class CaixaRegistradora {

    private double totalVendas;
    private int numeroDoCaixa;

    public CaixaRegistradora(int numeroDoCaixa) {
        this.totalVendas = 0.0;
        this.numeroDoCaixa = numeroDoCaixa;
        System.out.println("Caixa " + numeroDoCaixa + " aberto.");
    }

    public void adicionarVenda(double valor) {
        if (valor > 0) {
            this.totalVendas += valor;
            System.out.printf("Caixa %d: Venda de R$%.2f registrada. Total parcial: R$%.2f\n", numeroDoCaixa, valor,
                    totalVendas);
        }
    }

    public void fecharCaixa() {
        System.out.printf("Fechando o caixa %d. Total de vendas do dia: R$%.2f\n", numeroDoCaixa, totalVendas);
        this.totalVendas = 0;
    }
}
