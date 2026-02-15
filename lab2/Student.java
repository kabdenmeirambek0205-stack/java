public class Student {
    String name = "Мейрамбек";

    public static void main(String[] args) {
        Uniber u = new Uniber();
        System.out.println("Студент: " + u.name);
        System.out.println("Университет: " + u.univerName);
        System.out.println("Кафедра: " + u.kafName);
    }
}

class Kafedra {
    String kafName = "Ақпараттық технологиялар";
}

class Uniber extends Kafedra { // uniber класы kafedra-дан мұра алады
    String univerName = "АТУ";
    String name = "Мейрамбек"; // Student қасиетін қолдану үшін
}