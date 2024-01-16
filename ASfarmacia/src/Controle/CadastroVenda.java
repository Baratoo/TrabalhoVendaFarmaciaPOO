package Controle;

import Gerenciamento.Cliente;
import Gerenciamento.Funcionario;
import Gerenciamento.Venda;
import static Controle.CadastroCliente.clientes;
import static Controle.CadastroFuncionario.funcionarios;
import Gerenciamento.ItemVenda;
import Gerenciamento.Medicamento;
import Gerenciamento.MedicamentoControlado;
import Gerenciamento.Produto;
import java.time.LocalDate;
import java.util.ArrayList;
import util.Input;

/**
 *
 * @author geova
 */
public class CadastroVenda {
   protected static ArrayList<Venda> vendas = new ArrayList(); 
   
    public static void setarDados(Venda venda){
       
        System.out.println("Informe o codigo da venda");
        venda.setCodigo(Input.nextInt());
       
        System.out.println("Informe o codigo do funcionario");
        int cod_func = Input.nextInt();
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCodigo() == (cod_func)){
                venda.setFuncionario(funcionario);
            }
        }
        
        System.out.println("Informe o codigo do cliente");
        int cod_cli = Input.nextInt();
        for (Cliente cliente : clientes) {
            if (cliente.getCodigo() == (cod_cli)){
                venda.setCliente(cliente);
            }
        }
        
        venda.setData(LocalDate.now());
        int sair = 1;
        System.out.println("Insira os produtos:");
        while(sair != 0){
            venda.adicionarItem(CadastroItemVenda.cadastrar());
            System.out.println("Para finalizar a compra digite 0");
            sair = Input.nextInt();
        }
    }
   
    public static void cadastrar(){
       Venda venda = new Venda();
       setarDados(venda);
       vendas.add(venda);
    }
    
     public static double calcularDesconto(ItemVenda it, Cliente cli) {
        double valorDesconto = 0.0;
        if(it.getProduto() instanceof Produto){
            valorDesconto = it.getValorTotal()* 0.06;
        }
        
        if(it.getProduto() instanceof Medicamento){
            valorDesconto = it.getValorTotal()* 0.10;
        }
        
        if(it.getProduto() instanceof MedicamentoControlado){
            valorDesconto = it.getValorTotal()* 0.03;
        } else {
        }
     
        if(CadastroCliente.calculaIdade(cli) > 60 && it.getValorTotal() > 100){
            valorDesconto = valorDesconto + 10;     
        }
        
        return valorDesconto;
    }

   
    public static void listar() {
        System.out.println("Printando!");
        for (Venda venda : vendas) {
            System.out.println("Codigo da Venda: " + venda.getCodigo() + ", Nome do Cliente: "
                    + venda.getCliente().getNome() + ", Data: " + venda.getData() + ", Quantidade de Produtos: "
                    + venda.getItens().size() + ", Valor dos Produtos: " + venda.getValorProduto() + ", Desconto: "
                    + venda.getDesconto() + ", Valor Total: " + venda.getValorTotal());
        }
    }
    
        public static void exibirDetalhesVenda(int codigoVenda) {
        for (Venda venda : vendas) {
            if (venda.getCodigo() == codigoVenda) {
                System.out.println("Codigo da Venda: " + venda.getCodigo() + ", Nome do Cliente: "
                        + venda.getCliente().getNome() + ", Data: " + venda.getData() + ", Valor dos Produtos: "
                        + venda.getValorProduto() + ", Desconto: " + venda.getDesconto() + ", Valor Total: "
                        + venda.getValorTotal());
                System.out.println("Detalhes dos Produtos:");

                for (ItemVenda item : venda.getItens()) {
                    Produto produto = item.getProduto();
                    System.out.println("Descricao: " + produto.getDescricao() + ", Quantidade: " + item.getQuantidade()
                            + ", Valor Unitario: " + item.getValorUnitario() + ", Valor Total: " + item.getValorTotal());
                }
            }
        }
    }
}
