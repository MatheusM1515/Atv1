public class Ex27 {

    public static void main(String[] args) {
        int num = 28;

        int SomaDiv = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                SomaDiv += i;
            }
        }

        if (SomaDiv == num) {
            System.out.println("O número é perfeito.");
        } else {
            System.out.println("O número não é perfeito.");
        }
    }
}
