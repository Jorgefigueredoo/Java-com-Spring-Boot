package ListaCoding.ex21;

import java.util.List;
import java.util.ArrayList;

public class PedidoLanche {
    private String tamanho;
    private List<String> opcionais;

    public PedidoLanche(String tamanho) {
        this.tamanho = tamanho;
        this.opcionais = new ArrayList<>();
    }

    public void adicionarOpcional(String opcional) {
        this.opcionais.add(opcional);
    }

    @Override
    public String toString() {
        return "PedidoDeLanche [tamanho=" + tamanho + ", opcionais=" + opcionais + "]";
    }
}
