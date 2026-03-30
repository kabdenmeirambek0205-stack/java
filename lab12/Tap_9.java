import java.util.Scanner;

public class Tap_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();

        String result=s.replaceAll("[aeiouәіоуыөұүеэюя]","*");
        System.out.println(result);
    }
}