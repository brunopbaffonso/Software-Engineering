package json_ex;

/**
 *
 * @author Bruno P. B. Affonso
 * @RA 13019626
 */

/*
Classe Usuario responsavel pela Entidade do Software
Tal classe retorna pelo método toString() o correspondente JSON da entrada
 */
public class Usuario {

    int id;
    String nome;
    String cpf;
    String email;
    String telefone;

    Usuario(int id, String nome, String cpf, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "    Usuário {"
                + "\n      ID : " + this.id + ","
                + "\n       Nome : \"" + this.nome + "\","
                + "\n       CPF : \"" + this.cpf + "\","
                + "\n       Email : \"" + this.email + "\","
                + "\n       Telefone : \"" + this.telefone + "\"\n }";
    }

}
