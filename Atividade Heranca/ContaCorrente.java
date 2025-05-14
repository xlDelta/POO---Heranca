public class ContaCorrente extends Conta {
    private PessoaFisica titular;

    public ContaCorrente(String agencia, String banco, String numero, PessoaFisica titular, double saldo) {
        super(agencia, banco, numero, saldo);
        this.titular = titular;
    }

    public ContaCorrente(String agencia, String banco, String numero, PessoaFisica titular) {
        super(agencia, banco, numero);
        this.titular = titular;
    }

    public PessoaFisica getTitular() {
        return titular;
    }

    public void setTitular(PessoaFisica titular) {
        this.titular = titular;
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
}


