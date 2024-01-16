package Controle;



import Gerenciamento.ItemVenda;
import Gerenciamento.Produto;
import static Controle.CadastroProduto.produtos;
import util.Input;

/**
 *
 * @author geova
 */
public class CadastroItemVenda {
   
    public static void setarDados(ItemVenda itemVenda){
       
        System.out.println("Informe o codigo do item: ");
        int codProd = Input.nextInt();
        for (Produto produto : produtos) {
            if (produto.getCodigo() == (codProd)){
                itemVenda.setProduto(produto);
                itemVenda.setValorUnitario(produto.getValor());
                itemVenda.setValorTotal(produto.getValor());
            }
        }
        
        System.out.println("Informe a quantidade: ");
        int qtdProd = Input.nextInt();
        itemVenda.setQuantidade(qtdProd);
        
        for (Produto produto : produtos) {
            if (produto.getCodigo() == (codProd)){
                itemVenda.setValorTotal(produto.getValor() * qtdProd);
            }
        }
    }
   
   public static ItemVenda cadastrar(){
       ItemVenda itemVenda = new ItemVenda();
       setarDados(itemVenda);
       return itemVenda;
   }
}
