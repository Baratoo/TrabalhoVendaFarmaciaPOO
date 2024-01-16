package Menu;

import java.time.LocalDate;
import Controle.*;
import java.util.Scanner;
/**
 *
 * @author geova
 */
public class FarmaciaMain {
    
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Cadastrar Funcionário");
            System.out.println("3. Cadastrar Produto");
            System.out.println("4. Realizar Venda");
            System.out.println("5. Listar Clientes");
            System.out.println("6. Listar Funcionários");
            System.out.println("7. Listar Produtos "
                    + "1- Medicamento"
                    + "2- Med. Controlado"
                    + "3- Med. injetavel"
                    + "4- Produto");
            System.out.println("8. Listar Vendas");
            System.out.println("9. Informe o codigo da venda para exibir os detalhes");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    CadastroCliente.cadastrar();
                    break;
                case 2:
                    CadastroFuncionario.cadastrar();
                    break;
                case 3:
                    CadastroProduto.cadastrar();
                    break;
                case 4:
                    CadastroVenda.cadastrar();
                    break;
                case 5:
                    CadastroCliente.listar();
                    break;
                case 6:
                    CadastroFuncionario.listar();
                    break;
                case 7:
                    int tipo = scanner.nextInt();
                    if(tipo == 1){
                        CadastroProduto.listar("Medicamento");
                    }else if(tipo == 2){
                        CadastroProduto.listar("MedicamentoControlado");
                    }else if(tipo == 3){
                        CadastroProduto.listar("MedicamentoInjetavel");
                    }else if(tipo == 4){
                        CadastroProduto.listar("Outros");
                    }
                    break;
                case 8:
                    CadastroVenda.listar();
                    break;
                case 9:
                    int cod = scanner.nextInt();
                    CadastroVenda.exibirDetalhesVenda(1);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opcao inválida! Tente novamente.");
                    break;
            }

            System.out.println();
        } while (opcao != 0);

        scanner.close();
    }
 }


