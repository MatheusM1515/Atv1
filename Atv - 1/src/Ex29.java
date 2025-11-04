import java.util.Scanner;

public class Ex29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Insira uma senha:");
            String senha = sc.nextLine();

            if (senha.length() < 6 || senha.contains("123")) {
                System.out.println("Senha invalida.");
            } else {
                System.out.println("Senha valida.");
                break;
            }
        } while (true);
    }
}
