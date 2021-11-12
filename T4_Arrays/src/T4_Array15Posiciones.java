public class T4_Array15Posiciones {
    public static void main(String[] args) {

        int[] num = new int[15];
        int par = 0;
        int impar = 0;

        for (int i = 0; i<15; i++){
            num[i] = (int) (Math.random() * 51);
            System.out.println(num[i]);

            if (num[i] % 2 == 0){
                par++;
            } else {
                impar++;
            }
        }

        System.out.println("Hay " + par + " números pares.");
        System.out.println("Hay " + impar + " imnúmeros pares.");
    }
}
