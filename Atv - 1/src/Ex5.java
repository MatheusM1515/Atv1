import java.util.Scanner;

class Ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número\n");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número\n");
        double num2 = sc.nextDouble();

        System.out.print("Qual operação você deseja?\n");
        char op = sc.next().charAt(0);

        if (op == '+') {
            System.out.println(
                "O resultado da soma de " +
                    num1 +
                    " com " +
                    num2 +
                    " é " +
                    (num1 + num2)
            );
        } else if (op == '-') {
            System.out.println(
                "O resultado da subtração de " +
                    num1 +
                    " com " +
                    num2 +
                    " é " +
                    (num1 - num2)
            );
        } else if (op == '*') {
            System.out.println(
                "O resultado da multiplicação de " +
                    num1 +
                    " com " +
                    num2 +
                    " é " +
                    (num1 * num2)
            );
        } else if (op == '/') {
            System.out.println(
                "O resultado da divisão de " +
                    num1 +
                    " com " +
                    num2 +
                    " é " +
                    (num1 / num2)
            );
        }
        sc.close();
    }
}
