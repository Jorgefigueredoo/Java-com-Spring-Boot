package ListaCoding.ex24;

public class Cofre {

    private final String senha;
    private boolean aberto;

    public Cofre(String senhaInicial) {
        this.senha = senhaInicial;
        this.aberto = false;
    }

    public void abrir(String tentativa) {
        if (tentativa.equals(this.senha)) {
            this.aberto = true;
            System.out.println("Cofre aberto com sucesso.");
        } else {
            System.out.println("Senha incorreta. Acesso negado.");
        }
    }

    public void fechar() {
        this.aberto = false;
        System.out.println("Cofre fechado.");
    }

    public Cofre alterarSenha(String senhaAntiga, String senhaNova) {
        if (aberto && senhaAntiga.equals(this.senha)) {
            System.out.println("Senha alterada com sucesso.");
            return new Cofre(senhaNova);
        } else if (!aberto) {
            System.out.println("Não é possível alterar a senha com o cofre fechado.");
        } else {
            System.out.println("A senha antiga informada está incorreta.");
        }
        return this;
    }
}
