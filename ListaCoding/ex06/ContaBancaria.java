package ListaCoding.ex06;

public class ContaBancaria {

    private double saldo;
    private String titular;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + String.format("%.2f", valor) + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
        } else if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + String.format("%.2f", valor) + " realizado com sucesso.");
        } else {
            System.out.println("Tentativa de saque falhou. Saldo insuficiente.");
        }
    }

    public void verificarSaldo() {
        System.out.println("Titular: " + this.titular + " | Saldo atual: R$ " + String.format("%.2f", this.saldo));
    }
}
