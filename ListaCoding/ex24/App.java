package ListaCoding.ex24;

public class App {

    public static void main(String[] args) {
        System.out.println("--- Demonstração: Cofre ---");
        Cofre meuCofre = new Cofre("1234");

        System.out.println("\nTentando abrir com a senha errada:");
        meuCofre.abrir("4321");

        System.out.println("\nTentando alterar a senha com o cofre fechado:");
        meuCofre = meuCofre.alterarSenha("1234", "5678");

        System.out.println("\nTentando abrir com a senha correta:");
        meuCofre.abrir("1234");

        System.out.println("\nAgora alterando a senha com ele aberto:");
        meuCofre = meuCofre.alterarSenha("1234", "5678");

        meuCofre.fechar();

        System.out.println("\nTentando abrir com a senha antiga (deve falhar):");
        meuCofre.abrir("1234");

        System.out.println("\nTentando abrir com a senha nova (deve funcionar):");
        meuCofre.abrir("5678");
    }
}
