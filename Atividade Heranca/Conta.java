public abstract class Conta {
    private String numero;
    private String agencia;
    private String banco;
    private double saldo;

    public Conta(String agencia, String banco, String numero, double saldo) {
        this.agencia = agencia;
        this.banco = banco;
        this.numero = numero;
       
        this.saldo = saldo;
    }

      public Conta(String agencia, String banco, String numero) {
        this.agencia = agencia;
        this.banco = banco;
        this.numero = numero;
       
      
    }
    

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
  public abstract boolean sacar(double valor);

  public boolean depositar(double valor){
    if(valor > 0 ){
      saldo = saldo + valor;
      System.out.println("Deposito realizado com sucesso");
      return true;
    }else{
    System.out.println("Erro, nao foi possivel realizar deposito");
    return false;
    }
  }

   public boolean transferir(double valor, Conta contaDestino){
    if(this.sacar(valor)){

      contaDestino.depositar(valor);
      System.out.println("Transferencia realizado com sucesso");
      return true;
    }else{
    System.out.println("Erro, nao foi possivel realizar transferencia");
    return false;
    }
  }
}
