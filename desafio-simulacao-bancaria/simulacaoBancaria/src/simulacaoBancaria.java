import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class simulacaoBancaria {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PrintStream var = System.out;

        double amount = 0.0;

        try {
            scanner.useLocale(Locale.US);

            boolean running = true;
            while (running) {

                int option = scanner.nextInt();
                double value = 50.0;

                switch (option) {
                    case 1:

                        value = scanner.nextDouble();
                        amount += value;

                        var.println("Saldo atual: " + amount);

                        break;
                    case 2:

                        value = scanner.nextDouble();

                        if (value > amount) {
                            var.println("Saldo insuficiente.");
                        } else {
                            amount -= value;
                            var.println("Saldo atual: " + amount);
                        }

                        break;
                    case 3:

                        var.println("Saldo atual: " + amount);

                        break;
                    case 4:
                    case 0:

                        var.println("Programa encerrado.");
                        running = false;

                        continue;
                    default:

                        var.println("Opção inválida. Tente novamente.");
                        break;
                }
            }
        } finally {
            scanner.close();
        }
    }
}
