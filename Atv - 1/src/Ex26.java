public class Ex26 {

    public static void main(String[] args) {
        int N = 10;
        int soma = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }
        System.out.println(
            "A soma dos números impares de 1 a " + N + " é: " + soma
        );
    }
}
