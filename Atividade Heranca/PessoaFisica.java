
public class PessoaFisica extends Pessoa {

    private String cpf;

    public PessoaFisica(String cpf, String DataNascimento, String genero, String nome, String telefone) {
        super(DataNascimento, genero, nome, telefone);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
