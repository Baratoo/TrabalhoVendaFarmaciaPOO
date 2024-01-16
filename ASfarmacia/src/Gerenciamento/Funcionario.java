package Gerenciamento;

import java.time.LocalDate;

/**
 *
 * @author geova
 */
public class Funcionario extends Pessoa {
    private String ctps;

    public Funcionario() {
    }

    public Funcionario(int codigo, String nome, String cpf, LocalDate dataNascimento, String ctps) {
        super(codigo, nome, cpf, dataNascimento);
        this.ctps = ctps;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }
}
