package Gerenciamento;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author geova
 */
public class Venda {
    protected int codigo;
    protected Funcionario funcionario;
    protected Cliente cliente;
    protected LocalDate data;
    protected double valorProduto;
    protected double desconto;
    protected double valorTotal;
    protected ArrayList<ItemVenda> itens = new ArrayList(); 

    public Venda() {
    }

    public Venda(int codigo, Funcionario funcionario, Cliente cliente, LocalDate data, double desconto) {
        this.codigo = codigo;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.data = data;
        this.desconto = desconto;
        this.valorProduto = 0.0;
        this.valorTotal = 0.0;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemVenda item) {
        itens.add(item);
        calcularValores();
    }

    public void removerItem(ItemVenda item) {
        itens.remove(item);
        calcularValores();
    }

    private void calcularValores() {
        valorProduto = 0.0;
        for (ItemVenda item : itens) {
            valorProduto += item.getValorTotal();
        }

        valorTotal = valorProduto - desconto;
    }

    // Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    } 
    
    public double getValorProduto() {
        return valorProduto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
        calcularValores();
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public ArrayList<ItemVenda> getItens() {
        return itens;
    }
    
}
