public class Ejercicio02 {
    public static void main(String[] args) {
        int[] numeros = new int[30];
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 11);
            System.out.println(numeros[i]);
            suma += numeros[i];
        }

        double media = (double)suma/ (double)numeros.length;

        System.out.printf("La media es: %.3f%n", media);
        System.out.println("La suma es: " + suma);
    }
}
