package Controle;

import static Controle.CadastroProduto.produtos;
import Gerenciamento.MedicamentoControlado;
import Gerenciamento.Produto;

/**
 *
 * @author geova
 */
public class CadastroMedControlado {
    public static void setarDados(MedicamentoControlado medControlado){
        CadastroMedicamento.setarDados(medControlado);
    }

    public CadastroMedControlado() {
    }
    
    
    public static void cadastrar(){
        Produto m = new MedicamentoControlado();
        setarDados((MedicamentoControlado) m);
        produtos.add(m);
    }
}
