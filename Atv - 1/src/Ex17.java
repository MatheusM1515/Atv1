import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor: ");
        int valor = sc.nextInt();

        int notaCem = 0,
            notaCinquenta = 0,
            notaVinte = 0,
            notaDez = 0,
            notaUm = 0;

        while (valor >= 100) {
            notaCem += 1;
            valor -= 100;
        }
        while (valor >= 50) {
            notaCinquenta += 1;
            valor -= 50;
        }
        while (valor >= 20) {
            notaVinte += 1;
            valor -= 20;
        }
        while (valor >= 10) {
            notaDez += 1;
            valor -= 10;
        }
        while (valor >= 1) {
            notaUm += 1;
            valor -= 1;
        }

        System.out.println("Notas de 100: " + notaCem);
        System.out.println("Notas de 50: " + notaCinquenta);
        System.out.println("Notas de 20: " + notaVinte);
        System.out.println("Notas de 10: " + notaDez);
        System.out.println("Notas de 1: " + notaUm);
        sc.close();
    }
}
