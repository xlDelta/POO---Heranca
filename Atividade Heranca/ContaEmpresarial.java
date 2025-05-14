public class ContaEmpresarial extends ContaEspecial {

    private PessoaJuridica titular;

    public ContaEmpresarial(double valorChequeEspecial, String agencia, String banco, String numero, PessoaJuridica titular, double saldo) {
        super(valorChequeEspecial, agencia, banco, numero, titular, saldo);  
        this.titular = titular;
    }

    public ContaEmpresarial(double valorChequeEspecial, String agencia, String banco, String numero, PessoaJuridica titular) {
        super(valorChequeEspecial, agencia, banco, numero, titular);  
        this.titular = titular;
    }

    public ContaEmpresarial(String agencia, String banco, String numero, PessoaJuridica titular) {
        super(agencia, banco, numero, titular); 
        this.titular = titular;
    }

    public PessoaJuridica getTitular() {
        return titular;
    }

    public void setTitular(PessoaJuridica titular) {
        this.titular = titular;
    }
}
