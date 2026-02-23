public class tap5 {
    public static void main(String[] args) {
        int[] A = new int[10];

        for (int i = 0; i < 10; i++) {
            A[i] = (int)(Math.random()*50);
            System.out.print(A[i] + " ");
        }

        System.out.println("\nКері ретпен:");
        for (int i = 9; i >= 0; i--)
            System.out.print(A[i] + " ");
    }
}