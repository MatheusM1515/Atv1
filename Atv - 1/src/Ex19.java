import java.util.Scanner;

public class Ex19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int RandomN = (int) (Math.random() * 100);

        int tentativas = 10;

        while (tentativas >= 1) {
            System.out.println("Digite um número entre 1 e 100:");
            System.out.println();
            int chute = sc.nextInt();
            System.out.println();

            while (chute < 1 || chute > 100) {
                System.out.println("Número inválido! Digite novamente:");
                chute = sc.nextInt();
            }

            if (chute == RandomN) {
                System.out.println("Você acertou!");
                break;
            } else if (chute > RandomN) {
                System.out.println("O número é menor!\n");
                tentativas--;
                System.out.println(
                    "Tentativas restantes: " + tentativas + "\n"
                );
            } else {
                System.out.println("O número é maior!");
                tentativas--;
                System.out.println(
                    "Tentativas restantes: " + tentativas + "\n"
                );
            }
        }
        sc.close();
    }
}
