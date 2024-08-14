import java.util.Scanner;

public class ContaTerminal {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá! Seja bem vindo ao banco Java.\nDigite o nome do usuário: ");
        String usuário = sc.nextLine();

        System.out.println("Digite o número da agência:");
        String agência = sc.nextLine();

        System.out.println("Digite o número da conta:");
        String conta = sc.nextLine();

        System.out.println("Digite o valor solicitado para saque:");
        double valor = sc.nextDouble();

        System.out.printf("Olá "+usuário+", obrigado por criar uma conta em nosso banco.\nSua agência é "+agência+", conta "+conta+" e seu saldo de R$ "+valor+" já está disponível para saque.");

        sc.close();





    }


}
