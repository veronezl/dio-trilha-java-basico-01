import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int numeroConta;
        String numeroAgencia, nomeTitular;
        double saldo;

        System.out.println("Digite o número da sua conta: ");
            numeroConta = sc.nextInt();

        System.out.println("Digite sua o número da agência: ");
            numeroAgencia = sc.next();

        System.out.println("Digite o nome do titular: ");
            nomeTitular = sc.nextLine();
            sc.nextLine();

        System.out.println("Digite o valor a depositar: ");
            saldo = sc.nextDouble();

        System.out.println("Olá" + nomeTitular 
         + ", obrigado por criar uma conta em nosso banco, sua agência é "
         + numeroAgencia + ",conta " + numeroConta + " e seu saldo " 
         + saldo + " já está disponível para saque.");

        sc.close();

    }
}
