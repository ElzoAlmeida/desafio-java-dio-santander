import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //criando o objeto scanner
       
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Por favor, digite sua Conta");
            int conta = scanner.nextInt();
            
            System.out.println("Por favor, digite sua Agência");
            String agencia = scanner.next();
            
            System.out.println("Por favor, digite o nome do Cliente");
            String nomeCliente = scanner.next();
            
            System.out.println("Por favor, digite seu Saldo");
            double saldo = scanner.nextDouble();

            String SaldoDecimal = String.format("%.2f", saldo);

            
            //imprimindo os dados obtidos pelo usuario
            System.out.println("Ola, " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + conta + 
                                " e seu saldo R$ " + SaldoDecimal + " já está disponível para saque");
        }
    
    }

}

