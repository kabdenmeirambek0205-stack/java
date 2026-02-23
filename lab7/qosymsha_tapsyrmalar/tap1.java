public class tap1 {
    public static void main(String[] args) {
        int[] A = new int[20];
        int count = 0;

        for (int i = 0; i < 20; i++) {
            A[i] = (int)(Math.random()*50);
            System.out.print(A[i] + " ");
            if (A[i] % 2 == 0) count++;
        }

        System.out.println("\nЖұп сандар саны: " + count);
    }
}