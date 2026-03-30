import java.util.Scanner;

public class Tap_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();

        int vowel=0, consonant=0;
        String v="aeiouәіоуыөұүеэюя";

        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                if(v.indexOf(c)!=-1) vowel++;
                else consonant++;
            }
        }

        System.out.println("Дауысты: "+vowel);
        System.out.println("Дауыссыз: "+consonant);
    }
}