package Controle;

import Gerenciamento.Produto;
import java.util.ArrayList;
import util.Input;

/**
 *
 * @author geova
 */
public class CadastroProduto {
    
    protected static ArrayList<Produto> produtos = new ArrayList();
    
    public static void setarDados(Produto produto){       
        System.out.println("Informe o codigo ");
        produto.setCodigo(Input.nextInt());
        System.out.println("Informe a descricao ");
        produto.setDescricao(Input.nextLine());
        System.out.println("Informe a marca ");
        produto.setMarca(Input.nextLine());
        System.out.println("Informe a lote ");
        produto.setLote(Input.nextLine());
        System.out.println("Informe a data de fabricacao ");
        produto.setDataFabricacao(Input.nextLocalDate());
        System.out.println("Informe a data de vencimento ");
        produto.setDataVencimento(Input.nextLocalDate());
        System.out.println("Informe o codigo de barras ");
        produto.setCodigoBarras(Input.nextLine());
        System.out.println("Informe o valor ");
        produto.setValor(Input.nextDouble());
    }
    
    public static void cadastrar(){
        Produto p= new Produto();
        setarDados(p);
        produtos.add(p);
    }
    
    public static void listar(String tipo) {
        for (Produto produto : produtos) {
            if (produto.getClass().getSimpleName().equals(tipo)) {
                System.out.println(tipo+": Codigo: " + produto.getCodigo() + ", Descricao: " + produto.getDescricao()
                        + ", Marca: " + produto.getMarca() + ", Lote: " + produto.getLote() + ", Data de Fabricacao: "
                        + produto.getDataFabricacao() + ", Data de Vencimento: " + produto.getDataVencimento()
                        + ", Codigo de Barras: " + produto.getCodigoBarras() + ", Valor: " + produto.getValor());
            }
        }
    }
}
