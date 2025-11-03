import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        int soma=0;

        for (int i = 1; i <=n; i++) {
            soma+=i;
        }
        System.out.println("A soma é " + soma);

        sc.close();
    }
}