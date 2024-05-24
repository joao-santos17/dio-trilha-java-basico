import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {

        public static void main(String[] args) {

            System.out.println("Executando nosso primeiro projeto 'ContaBanco'.");
            //To do: Conhecer e importar a classe Scanner

            //Exibir as mensagens para o nosso usuário

            //Obter pela scanner os valores digitados no terminal

            //Exibir a mensagem conta criada

            

            //Criando o objeto Scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


                System.out.println("Por favor, digite o número da Agência: ");
                String Agencia = scanner.next(); 


                System.out.println("Por favor, digite seu nome: ");
                String Nome_Cliente = scanner.next();


                System.out.println("Por favor, digite o número da conta: ");
                int Numero = scanner.nextInt();


                System.out.println("Saldo da conta: ");
                Double Saldo = scanner.nextDouble();


                System.out.println("Sua conta foi Criada!");

                System.out.println("================================");

                System.out.println("Olá " + Nome_Cliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque!");
             
        }
}