import java.util.Scanner;

public class Tap_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        String[] words=s.split(" ");
        String max="";

        for(String w:words)
            if(w.length()>max.length())
                max=w;

        System.out.println("Ең ұзын сөз: "+max);
    }
}