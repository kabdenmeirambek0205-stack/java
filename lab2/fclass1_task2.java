import java.util.Scanner;

public class fclass1_task2 {
    int a, b;

    public static void main(String[] args) {
        fclass1_task2 obj = new fclass1_task2();
        fclass2_helper helper = new fclass2_helper();
        helper.setData(obj);

        System.out.println("Енгізілген мәндер: a = " + obj.a + ", b = " + obj.b);
    }
}

class fclass2_helper {
    void setData(fclass1_task2 o) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a мәнін енгізіңіз: ");
        o.a = sc.nextInt();
        System.out.print("b мәнін енгізіңіз: ");
        o.b = sc.nextInt();
    }
}