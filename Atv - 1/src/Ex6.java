import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número\n");
        int n1 = sc.nextInt();

        if (n1 %2 == 0){
            System.out.println("O número " + n1 + "é par");
            }
        else {
            System.out.println("O número " + n1 + "é impar");
        }
        sc.close();

    }
}
