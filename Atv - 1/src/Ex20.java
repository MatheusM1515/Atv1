import java.util.Scanner;

public class Ex20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=========== Conversor de Moedas ==========\n");
        System.out.println("Digite quantos reais você deseja converter:");
        double reais = sc.nextDouble();
        double dolar = reais / 5.2;
        double euro = reais / 6.3;

        System.out.println(
            "Você quer saber o quanto isto vale em doláres ou em euros?\n\n d - Dólar\n e - Euro\n"
        );
        char opcao = sc.next().charAt(0);
        if (opcao == 'd') {
            System.out.println(
                "O valor em dólares é: " + String.format("%.2f", dolar)
            );
        } else if (opcao == 'e') {
            System.out.println(
                "O valor em euros é: " + String.format("%.2f", euro)
            );
        } else {
            System.out.println("Opção inválida!");
        }
    }
}
