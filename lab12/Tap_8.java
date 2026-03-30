import java.util.Scanner;

public class Tap_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        s=s.replaceAll("[0-9]","");
        System.out.println(s);
    }
}