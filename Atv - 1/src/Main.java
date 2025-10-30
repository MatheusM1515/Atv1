import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=========== Atividade 1 - Familiarizando com Java ===========\n");

        System.out.println("Ex 1: ");

        System.out.println("\nHello world!\n");

        System.out.println("Ex 2: \n");

        boolean falso = true;
        double valor1 = 14.5;
        char carc = 'a';
        int numer1 = 5;

        System.out.println("Boleano = " + falso + "\n double = " + valor1 + "\n char = " + carc + "\n int = " + numer1 + "\n");

        System.out.println("Ex 3: \n");

        System.out.print("Digite o primeiro número\n");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo número\n");
        double n2 = sc.nextDouble();

        System.out.println("O resultado da soma de " + n1 + " com " + n2 + " é " + (n1+n2));

        System.out.println("\nEx 4: \n");

        System.out.println("O resultado da multiplicação de " + n1 + " com " + n2 + " é " + (n1*n2));
        System.out.println("O resultado da subtração de " + n1 + " com " + n2 + " é " + (n1-n2));
        System.out.println("O resultado da divisão de " + n1 + " com " + n2 + " é " + (n1/n2));

        System.out.println();

        System.out.println("Ex 5: \n");

        System.out.print("Digite o primeiro número\n");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número\n");
        double num2 = sc.nextDouble();

        System.out.print("Qual operação você deseja?\n");
        char op = sc.next().charAt(0);

        if (op == '+') {
            System.out.println("O resultado da soma de " + num1 + " com " + num2 + " é " + (num1+num2));
        }
        else if (op == '-') {
            System.out.println("O resultado da subtração de " + num1 + " com " + num2 + " é " + (num1-num2));
        }




    }
}