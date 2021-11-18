package T4_Arrays;

public class Arrays {
    public static void main(String[] args) {
        // array de números

        int[] numeros = new int[10];
        int[] numerosDos = {1,2,3,4,5,6,7,8,9,10};

        boolean[] aciertos = new boolean[5];
        String[] palabras = new String[3];

        int longitudArray = numerosDos.length;
        System.out.println(longitudArray);

        System.out.println(numerosDos[0]);
    }
}
