import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n1 - Fahrenheit  para Celsius\n2 - Celsius para Fahrenheit \n");
        int op = sc.nextInt();

        double TempCerta;

        switch (op){
            case 1:
                System.out.println("Digite a temperatura: ");
                double temp = sc.nextDouble();
                TempCerta=(temp-32)/1.8;
                System.out.println("Esta temperatura em Celsius é: " + TempCerta);
                break;
            case 2:
                System.out.println("Digite a temperatura: ");
                temp = sc.nextDouble();
                TempCerta=(temp*1.8)+32;
                System.out.println("Esta temperatura em Fahrenheit  é: " + TempCerta);
                break;
            default:
                System.out.println("Opção invalida!\n");
                break;
        }
        sc.close();
    }
}