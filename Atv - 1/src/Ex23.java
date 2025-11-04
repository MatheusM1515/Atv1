import java.util.Scanner;

public class Ex23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        for (int x = 1; x <= num; x++) {
            for (int y = 1; y <= num; y++) {
                if ((x + y) == ((x - 1) + (x - 1)) + (x - 2) + (y - 2)) {
                    System.out.println(+(x + y) + " é primo????????");
                }
            }
        }
    }
}
