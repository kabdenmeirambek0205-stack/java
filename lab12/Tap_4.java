import java.util.Scanner;

public class Tap_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        int count=s.replace(" ","").length();
        System.out.println("Таңбалар саны: "+count);
    }
}