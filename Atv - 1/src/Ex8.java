import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos anos você tem?\n");
        int id = sc.nextInt();

        if (id <= 12 ){
        System.out.println("Você é uma criança!");
    }
        else if (id <=18) {
            System.out.println("Você é um adolescente!");
        }
        else if (id <=60) {
            System.out.println("Você é um adulto!");
        }
        else{
            System.out.println("Você é um idoso!");
        }

        }
}