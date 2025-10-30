import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();


        if (n >0) {
            System.out.println("O número é positivo!");
        }
        else if(n<0 ) {
            System.out.println("O número é negativo!");
        }
        else if (n==0){
            System.out.println("O número é 0!");
        }
    }
}