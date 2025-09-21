package ListaCoding.ex06;

public class App {

    public static void main(String[] args) {
        System.out.println("--- Demonstração Conta Bancária ---");
        ContaBancaria minhaConta = new ContaBancaria("Maria Silva", 500.00);
        minhaConta.verificarSaldo();

        System.out.println("\nRealizando operações...");
        minhaConta.depositar(250.50);
        minhaConta.verificarSaldo();

        // Saque válido
        System.out.println("\nTentando saque válido...");
        minhaConta.sacar(150.00);
        minhaConta.verificarSaldo();

        // Tentativa de saque além do saldo
        System.out.println("\nTentando saque além do saldo...");
        minhaConta.sacar(700.00);
        minhaConta.verificarSaldo();
    }
}
