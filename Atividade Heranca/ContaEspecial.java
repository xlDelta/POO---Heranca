public class ContaEspecial extends Conta {

    private double valorChequeEspecial = 2000;
    private Pessoa titular; 
    
    public ContaEspecial(double valorChequeEspecial, String agencia, String banco, String numero, Pessoa titular, double saldo) {
        super(agencia, banco, numero, saldo);
        this.valorChequeEspecial = valorChequeEspecial;
        this.titular = titular;
    }

    public ContaEspecial(double valorChequeEspecial, String agencia, String banco, String numero, Pessoa titular) {
        super(agencia, banco, numero);
        this.valorChequeEspecial = valorChequeEspecial;
        this.titular = titular;
    }

    public ContaEspecial(String agencia, String banco, String numero, Pessoa titular) {
        super(agencia, banco, numero);
        this.titular = titular;
    }

public double getValorChequeEspecial() {
        return valorChequeEspecial;
    }

    public void setValorChequeEspecial(double valorChequeEspecial) {
        this.valorChequeEspecial = valorChequeEspecial;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

public boolean sacar(double valor){

    if (valor > 0 && getSaldo() - valor >= -valorChequeEspecial){
    setSaldo(getSaldo() - valor);
    System.out.println("Saque realizado com sucesso");
    return true;
    } else {
    System.out.println(" O Valor do cheque especial foi ultrapassado");
            return false;
    }


}
}


