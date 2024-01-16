
package Controle;

import Gerenciamento.Funcionario;
import java.util.ArrayList;
import util.Input;

public class CadastroFuncionario {
    
    public static ArrayList<Funcionario> funcionarios = new ArrayList();
    
    public static void setarDados(Funcionario funcionario){
        CadastroPessoa.setarDados(funcionario);
        System.out.println("Informe o ctps");
        funcionario.setCtps(Input.nextLine());
    }
    
    public static void cadastrar(){
        Funcionario f = new Funcionario();
        setarDados(f);
        funcionarios.add(f);
    }
    
    public static void listar() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println("FUNCIONARIOS: Codigo: " + funcionario.getCodigo() + ", Nome: " + funcionario.getNome() + ", CPF: "
                    + funcionario.getCpf() + ", Data de Nascimento: " + funcionario.getDataNascimento() + ", CTPS: "
                    + funcionario.getCtps());
        }
    }
}
