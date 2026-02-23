public class Tap16 {

    public static int maxX(int[] arr){
        int max=arr[0];
        for(int x:arr)
            if(x>max) max=x;
        return max;
    }

    public static void main(String[] args) {
        int[] A=new int[10];
        for(int i=0;i<10;i++)
            A[i]=(int)(Math.random()*100);

        System.out.println("Max: "+maxX(A));
    }
}