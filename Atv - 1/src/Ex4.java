import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número\n");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo número\n");
        double n2 = sc.nextDouble();

        System.out.println("O resultado da multiplicação de " + n1 + " com " + n2 + " é " + (n1*n2));
        System.out.println("O resultado da subtração de " + n1 + " com " + n2 + " é " + (n1-n2));
        System.out.println("O resultado da divisão de " + n1 + " com " + n2 + " é " + (n1/n2));
    }
}
