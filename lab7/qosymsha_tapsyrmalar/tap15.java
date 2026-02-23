public class tap15 {
    public static void main(String[] args) {

        int[] A = new int[10];

        // Массивті толтыру
        for (int i = 0; i < 10; i++) {
            A[i] = (int)(Math.random()*100);
            System.out.print(A[i] + " ");
        }

        // Insertion Sort
        for (int i = 1; i < A.length; i++) {
            int key = A[i];
            int j = i - 1;

            while (j >= 0 && A[j] > key) {
                A[j + 1] = A[j];
                j--;
            }

            A[j + 1] = key;
        }

        System.out.println("\nСұрыпталған массив:");
        for (int x : A)
            System.out.print(x + " ");
    }
}