import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        while (num <= 0) {
            System.out.println("Número inválido. Digite um número positivo: ");
            num = scanner.nextInt();
        }

        boolean primo = true;

        if (num == 1 || num == 2) {
            primo = true;
        }
        for (int x = 2; x < num; x++) {
            if (num % x == 0) {
                primo = false;
                break;
            }
        }
        if (primo) {
            System.out.println(num + " é primo");
        } else {
            System.out.println(num + " não é primo");
        }
        scanner.close();
    }
}
