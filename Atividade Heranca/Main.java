import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Conta> contas = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n//////////////////////////////////////////////////////\n");
        System.out.println("Escolha uma Opcao");
        System.out.println("1 - Criar nova conta");
        System.out.println("2 - Exibir saldo da conta");
        System.out.println("3 - Sacar ");
        System.out.println("4 - Depositar ");
        System.out.println("5 - Transferir ");
        System.out.println("0 - Sair");
            
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
        case 1 -> criarConta();
        case 2 -> exibirSaldo();
        case 3 -> sacar();
        case 4 -> depositar();
        case 5 -> transferir();
        case 0 -> {
        System.out.println("Fim");
        scanner.close();
        return;
        
    }
    
    default -> System.out.println("Opcao indisponivel!");
}
}
}

    static void criarConta() {
        System.out.println("Para criar a conta, preencha os dados:\n");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Genero: ");
        String genero = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Numero da conta: ");
        String numero = scanner.nextLine();

        System.out.print("Agencia: ");
        String agencia = scanner.nextLine();

        System.out.print("Numero do banco: ");
        String banco = scanner.nextLine();


        PessoaJuridica proprietario = new PessoaJuridica(cpf, nome, genero, cpf, telefone);

        ContaEmpresarial novaConta = new ContaEmpresarial(agencia, banco, numero, proprietario);

        contas.add(novaConta);
        
        System.out.println("Conta criada com sucesso");
    }

    static Conta buscarConta(String numero) {
        for (Conta c : contas) {
        if (c.getNumero().equals(numero)) {
        return c;
}
} 
    return null;
}


static void exibirSaldo() {
    System.out.print("Digite numero da conta: ");
    String numeroSaldo = scanner.nextLine();
    
    Conta conta = buscarConta(numeroSaldo);  
    if (conta != null) {
        System.out.println("Numero: " + conta.getNumero());
        System.out.println("Saldo: R$ " + conta.getSaldo());
    } else {
        System.out.println("Conta nao existe");
    }
}

static void sacar() {
    System.out.print("Numero da conta: ");
    String numeroSaque = scanner.nextLine();
    
    Conta conta = buscarConta(numeroSaque);  
    if (conta != null) {
        System.out.print("Valor retirado: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();  
        conta.sacar(valor);
    } else {
        System.out.println("Conta nao existe");
    }
}


static void depositar() {
    System.out.print("Numero da conta: ");
    String numeroDeposito = scanner.nextLine();

    Conta conta = buscarConta(numeroDeposito);  
    if (conta != null) {
        System.out.print("Valor do deposito: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); 
        conta.depositar(valor);
    } else {
        System.out.println("Conta nao existe");
    }
}


static void transferir() {
    System.out.print("Numero da conta que ira transferir: ");
    String contaTransferindo = scanner.nextLine();
    Conta contaEnvia = buscarConta(contaTransferindo); 

    System.out.print("Numero da conta que ira receber a transferencia: ");
    String contaRecebendo = scanner.nextLine();
    Conta contaRecebe = buscarConta(contaRecebendo); 
    if (contaEnvia != null && contaRecebe != null) {
        System.out.print("Valor da transferencia: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();  
        contaEnvia.transferir(valor, contaRecebe);
    } else {
        System.out.println("Conta que quer realizar a transferencia, ou a que ira receber nao foi encontrada");
    }
}
}