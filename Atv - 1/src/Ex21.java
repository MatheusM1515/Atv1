import java.util.Scanner;

public class Ex21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = sc.nextInt();

        System.out.println("A qual potencia você quer elevar este número?");
        int potencia = sc.nextInt();

        int resultado = num;

        for (int i = 1; i < potencia; i++) {
            resultado *= num;
        }

        System.out.println("A potencia deste número é: " + resultado);

        sc.close();
    }
}
