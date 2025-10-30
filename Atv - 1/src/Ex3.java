import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número\n");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo número\n");
        double n2 = sc.nextDouble();

        System.out.println("O resultado da soma de " + n1 + " com " + n2 + " é " + (n1+n2));
    }
}
