package Controle;

import static Controle.CadastroProduto.produtos;
import Gerenciamento.ItemVenda;
import Gerenciamento.Produto;
import java.util.ArrayList;
import util.Input;

/**
 *
 * @author geova
 */
public class CadastroItensVenda {
    protected static ArrayList<ItemVenda> itens = new ArrayList();
    
    public static void setarDados(ItemVenda item){
        System.out.println("Informe o codigo do produto");
        int cod_prod = Input.nextInt();
        for (Produto produto : produtos) {
            if (produto.getCodigo() == (cod_prod)){
                item.setProduto(produto);
                item.setValorUnitario(produto.getValor());
            }
            
        }
        
        System.out.println("Informe a quantidade:");
        item.setQuantidade(Input.nextInt());
        
        item.setValorTotal(item.getValorUnitario() * item.getQuantidade());
    }
    
    public static void cadastrar(){
        ItemVenda iv = new ItemVenda();
        setarDados(iv);
        itens.add(iv);
    }
}
    
