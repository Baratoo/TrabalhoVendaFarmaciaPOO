package Gerenciamento;

import java.time.LocalDate;

/**
 *
 * @author geova
 */
public class Medicamento extends Produto {
    private int numRegistroAnvisa;
    private String composicao;
    private double dosagem;

    public Medicamento() {
    }

    public Medicamento(int codigo, String descricao, String marca, String lote, LocalDate dataFabricacao,
                       LocalDate dataVencimento, String codigoBarras, double valor, int numRegistroAnvisa,
                       String composicao, double dosagem) {
        super(codigo, descricao, marca, lote, dataFabricacao, dataVencimento, codigoBarras, valor);
        this.numRegistroAnvisa = numRegistroAnvisa;
        this.composicao = composicao;
        this.dosagem = dosagem;
    }

    public int getNumRegistroAnvisa() {
        return numRegistroAnvisa;
    }

    public void setNumRegistroAnvisa(int numRegistroAnvisa) {
        this.numRegistroAnvisa = numRegistroAnvisa;
    }

    public String getComposicao() {
        return composicao;
    }

    public void setComposicao(String composicao) {
        this.composicao = composicao;
    }

    public double getDosagem() {
        return dosagem;
    }

    public void setDosagem(double dosagem) {
        this.dosagem = dosagem;
    }

}