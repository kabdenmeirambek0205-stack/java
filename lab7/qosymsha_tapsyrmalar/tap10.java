public class tap10 {
    public static void main(String[] args) {
        int[] A = new int[10];

        for (int i = 0; i < 10; i++) {
            A[i] = (int)(Math.random()*100);
            System.out.print(A[i] + " ");
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (A[j] < A[j+1]) {
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }

        System.out.println("\nКему ретімен:");
        for (int x : A)
            System.out.print(x + " ");
    }
}