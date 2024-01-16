package Controle;

import static Controle.CadastroProduto.produtos;
import Gerenciamento.MedicamentoInjetavel;
import Gerenciamento.Produto;

/**
 *
 * @author geova
 */
public class CadastroMedInjetavel {
    
        public static void setarDados(MedicamentoInjetavel medInjetavel){
        CadastroMedicamento.setarDados(medInjetavel);
    }
    
    public static void cadastrar(){
        Produto m = new MedicamentoInjetavel();
        setarDados((MedicamentoInjetavel) m);
        produtos.add(m);
    }
}

