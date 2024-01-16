package Controle;

import static Controle.CadastroProduto.produtos;
import Gerenciamento.Medicamento;
import Gerenciamento.Produto;
import util.Input;

/**
 *
 * @author geova
 */
public class CadastroMedicamento {
    
    public static void setarDados(Medicamento medicamento){
        CadastroProduto.setarDados(medicamento);       
        System.out.println("Informe o numero de registro Anvisa");
        medicamento.setNumRegistroAnvisa(Input.nextInt());
        System.out.println("Informe a composicao");
        medicamento.setComposicao(Input.nextLine());
        System.out.println("Informe a dosagem");    
        medicamento.setDosagem(Input.nextDouble());
    }
    
    public static void cadastrar(){
        Produto m = new Medicamento();
        setarDados((Medicamento) m);
        produtos.add(m);
    }
    
}
