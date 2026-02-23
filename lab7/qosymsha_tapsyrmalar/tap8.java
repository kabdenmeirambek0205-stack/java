public class tap8 {
    public static void main(String[] args) {
        int[] A = new int[20];

        for (int i = 0; i < 20; i++) {
            A[i] = (int)(Math.random()*100);
            System.out.print(A[i] + " ");
        }

        int min = A[0];
        int max = A[0];

        for (int i = 1; i < 20; i++) {
            if (A[i] < min) min = A[i];
            if (A[i] > max) max = A[i];
        }

        System.out.println("\nАйырмасы: " + (max - min));
    }
}