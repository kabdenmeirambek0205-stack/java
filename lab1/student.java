// Тапсырма 3: student, uniber, kafedra иерархиясы
// Егер файл аты main.java болса, төмендегі 'student' сөзін 'main' деп өзгертіңіз

public class student extends uniber {
    public static void main(String[] args) {
        // student объектісін құру
        student s = new student();

        // Студент мәліметтері
        String name = "Мейрамбек";
        int age = 17;

        System.out.println("--- Студент туралы ақпарат ---");
        System.out.println("Аты: " + name);
        System.out.println("Жасы: " + age);

        // Мұрагерлік арқылы келген айнымалыларды қолдану
        System.out.println("Университет: " + s.univerName);
        System.out.println("Кафедра: " + s.kafName);
    }
}

// uniber класы kafedra-дан мұра алады
class uniber extends kafedra {
    String univerName = "АТУ (Алматы технологиялық университеті)";
}

// Негізгі базалық класс
class kafedra {
    String kafName = "Ақпараттық технологиялар";
}