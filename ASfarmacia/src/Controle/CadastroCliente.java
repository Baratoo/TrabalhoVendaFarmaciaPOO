
package Controle;

import Gerenciamento.Cliente;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import util.Input;

public class CadastroCliente {
  
    public static ArrayList<Cliente> clientes = new ArrayList();
    
    public static void setarDados(Cliente cliente){
        CadastroPessoa.setarDados(cliente);       
        System.out.println("Informe o email");
        cliente.setEmail(Input.nextLine());
    }
    
    public static void cadastrar(){
        Cliente c = new Cliente();
        setarDados(c);
        clientes.add(c);
    }
    
    public static int calculaIdade(Cliente cliente) {
    LocalDate dataAtual = LocalDate.now();
    LocalDate dataNascimento = cliente.getDataNascimento();

    Period periodo = Period.between(dataNascimento, dataAtual);
    return periodo.getYears();
    }
    
    public static void listar() {
        for (Cliente cliente : clientes) {
            System.out.println("CLIENTES: Codigo: " + cliente.getCodigo() + ", Nome: " + cliente.getNome() + ", CPF: " + cliente.getCpf() + ", Data de Nascimento: " + cliente.getDataNascimento() + ", Email: " + cliente.getEmail());
        }
    }
}
