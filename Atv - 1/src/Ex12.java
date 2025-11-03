import java.util.Scanner;


public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as três notas: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();

        double media = (n1+n2+n3)/3;

        System.out.println("A sua média é " + media);
        sc.close();
    }
}