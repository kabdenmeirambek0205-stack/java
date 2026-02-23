public class tap12 {
    public static void main(String[] args) {
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[10];

        for (int i = 0; i < 5; i++) {
            A[i] = (int)(Math.random()*20);
            B[i] = (int)(Math.random()*20);
        }

        for (int i = 0; i < 5; i++) {
            C[i] = A[i];
            C[i+5] = B[i];
        }

        System.out.println("Біріктірілген массив:");
        for (int x : C)
            System.out.print(x + " ");
    }
}