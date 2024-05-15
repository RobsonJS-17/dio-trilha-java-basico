import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{
  public static void main (String[] args){
    
   Scanner scanner = new Scanner(System.in).useLocale(Locale.US);  
   
    System.out.println("BEM-VINDO AO BANCO DIO!");      

       //entrada de dados do usuario
        System.out.println("Digite o numero da Conta: ");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Digite o numero da Agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite o seu Nome: ");
        String nomeCliente = scanner.next();
              
        System.out.println("Digite o Valor do Depósito para finalizar a abertuda da conta: ");
        double saldo = scanner.nextDouble();
        
        //imprimindo os dados obtidos pelo usuario
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$ %.2f já está disponível para saque.", nomeCliente, agencia, numeroConta, saldo);

  }

}