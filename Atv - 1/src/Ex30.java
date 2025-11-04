import java.util.Scanner;

public class Ex30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números deseja digitar?");
        int qt = sc.nextInt();

        int numeros[] = new int[qt];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            numeros[i] = sc.nextInt();
        }

        int maior = numeros[0],
            menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println(
            "O maior número é: " + maior + "\nO menor número é: " + menor
        );

        sc.close();
    }
}
