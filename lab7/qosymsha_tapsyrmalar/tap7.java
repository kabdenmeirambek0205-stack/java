public class tap7 {
    public static void main(String[] args) {
        int[] A = new int[10];

        for (int i = 0; i < 10; i++) {
            A[i] = (int)(Math.random()*20);
            System.out.print(A[i] + " ");
        }

        System.out.println("\n2 еселенген:");
        for (int i = 0; i < 10; i++)
            System.out.print(A[i]*2 + " ");
    }
}