import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número\n");
        double n1 = sc.nextDouble();

        System.out.println("Digite o segundo número\n");
        double n2 = sc.nextDouble();

        if (n1 > n2) {
            System.out.println("O número " + n1 + " é maior do que " + n2);
        } else {
            System.out.println("O número " + n2 + " é maior do que " + n1);
            sc.close();
        }
    }
}
