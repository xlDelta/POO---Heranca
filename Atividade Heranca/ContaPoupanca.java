public class ContaPoupanca extends Conta {

    private double porcentagemRenda = 0.05;
    private PessoaFisica titular;

    public ContaPoupanca(String agencia, String banco, String numero, PessoaFisica titular, double saldo) {
        super(agencia, banco, numero, saldo);
        this.titular = titular;
    }


    public ContaPoupanca(String agencia, String banco, String numero, PessoaFisica titular) {
        super(agencia, banco, numero);
        this.titular = titular;
    }

    public PessoaFisica getTitular() {
        return titular;
    }

    public void setTitular(PessoaFisica titular) {
        this.titular = titular;
    }

    public double getPorcentagemRenda() {
        return porcentagemRenda;
    }

    public void setPorcentagemRenda(double porcentagemRenda) {
        this.porcentagemRenda = porcentagemRenda;
    }


public boolean sacar(double valor) {
    if (valor > 0 && getSaldo() >= valor) {
        setSaldo(getSaldo() - valor);
        System.out.println("Saque realizado com sucesso");
        return true;
    } else {
        System.out.println("Nao foi possivel realizar saque");
        return false;
    }
}

public boolean rendimento(){

    setSaldo(getSaldo() + getSaldo()* porcentagemRenda);
    return true;

}

}