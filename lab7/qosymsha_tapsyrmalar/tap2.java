public class tap2 {
    public static void main(String[] args) {
        int[] B = new int[15];
        int maxIndex = 0;

        for (int i = 0; i < 15; i++) {
            B[i] = (int)(Math.random()*100);
            System.out.print(B[i] + " ");
            if (B[i] > B[maxIndex]) maxIndex = i;
        }

        System.out.println("\nMax элемент: " + B[maxIndex]);
        System.out.println("Индексі: " + maxIndex);
    }
}