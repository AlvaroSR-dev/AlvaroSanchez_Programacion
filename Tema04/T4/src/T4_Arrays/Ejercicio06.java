package T4_Arrays;

public class Ejercicio06 {
    public static void main(String[] args) {
        int[] numeros = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 31);
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 6){
                numeros[i] = 8;
            } else if (numeros[i] == 7){
                numeros[i] = 15;
            } else if (numeros[i] == 20){
                numeros[i] = 10;
            }

            System.out.println(numeros[i]);
        }
    }
}
