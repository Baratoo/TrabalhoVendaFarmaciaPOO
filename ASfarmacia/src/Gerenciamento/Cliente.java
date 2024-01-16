package Gerenciamento;

import java.time.LocalDate;

/**
 *
 * @author geova
 */
public class Cliente extends Pessoa {
    protected String email;
    
    public Cliente() {
    }
    
    public Cliente(int codigo, String nome, String cpf, LocalDate dataNascimento, String email) {
        super(codigo, nome, cpf, dataNascimento);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
