package Gerenciamento;

import java.time.LocalDate;

/**
 *
 * @author geova
 */
public class MedicamentoControlado extends Medicamento {

    public MedicamentoControlado() {
    }
    
    public MedicamentoControlado(int codigo, String descricao, String marca, String lote, LocalDate dataFabricacao,
                                 LocalDate dataVencimento, String codigoBarras, double valor, int numRegistroAnvisa,
                                 String composicao, double dosagem) {
        super(codigo, descricao, marca, lote, dataFabricacao, dataVencimento, codigoBarras, valor, numRegistroAnvisa,
                composicao, dosagem);
    }
}
