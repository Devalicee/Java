import java.util.Scanner;

public class ComparaNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro");
        int num1 = scanner.nextInt();

        System.out.println("Digite o primeiro número:");

        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("O maior número é" + num1 + ".");
        } else if (num2 > num1) {
            System.out.println("O número maior é " + num2 + ".");

        } else {
            System.out.println("Os números são iguais");

        }
        scanner.close();
    }
}
