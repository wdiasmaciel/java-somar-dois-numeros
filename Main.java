import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2, soma;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        num1 = teclado.nextInt();

        System.out.println("Informe o segundo número: ");
        num2 = teclado.nextInt();

        soma = num1 + num2;

        System.out.println("Soma: " + soma);
        teclado.close();
    }
}