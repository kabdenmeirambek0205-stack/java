// Негізгі класс
class fclass1 {
    public void method1() {
        System.out.println("fclass1 әдісі");
    }

    public static void main(String[] args) {
        fclass2 obj = new fclass2();
        obj.method1(); // fclass1-ден мұраға қалды
        obj.method3(); // fclass3-тен мұраға қалды
        obj.method2(); // өз әдісі
    }
}

// fclass1-ден мұра алады
class fclass3 extends fclass1 {
    public void method3() {
        System.out.println("fclass3 әдісі");
    }
}

// fclass3-тен мұра алады
class fclass2 extends fclass3 {
    public void method2() {
        System.out.println("fclass2 әдісі");
    }
}
