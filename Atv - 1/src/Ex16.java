public class Ex16 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int pares=0;
        int impares=0;

        for (int i=0;i<numeros.length;i++) {
            numeros[i] =(int)(Math.random() * 101);
        }

        for (int o=0;o<numeros.length;o++){
            System.out.print(numeros[o] + " | ");
        }

        for (int j=0;j<numeros.length;j++) {
            if(numeros[j]%2==0){
                pares++;
            }
            else{
                impares++;
            }
        }
        System.out.println("\nO vetor tem : " + impares + " numeros impares e " + pares + " numeros pares\n");
    }
}