
package Controle;

import Gerenciamento.Pessoa;
import java.util.ArrayList;
import util.Input;

class CadastroPessoa {
    
    private static ArrayList<Pessoa> pessoas = new ArrayList();
    
    public static void setarDados(Pessoa pessoa){
        System.out.println("Informe o codigo");
        pessoa.setCodigo(Input.nextInt());     
        System.out.println("Informe o nome");
        pessoa.setNome(Input.nextLine());
         System.out.println("Informe o cpf");
        pessoa.setCpf(Input.nextLine());
        System.out.println("Informe a data de nascimento");
        pessoa.setDataNascimento(Input.nextLocalDate());
    }
    
    public static void cadastrar(){
        Pessoa p = new Pessoa();
        setarDados(p);
        pessoas.add(p);
    }
}
