// Файл аты: Lab.java
public class tap4 {
    String topic;
    int duration;

    public static void main(String[] args) {
        tap4 myLab = new tap4();
        Lec teacher = new Lec();

        teacher.setupLab(myLab, "ОББ негіздері", 2);
        System.out.println("Тақырыбы: " + myLab.topic + ", Сағаты: " + myLab.duration);
    }
}

class Lec {
    void setupLab(tap4 l, String t, int d) {
        l.topic = t;
        l.duration = d;
    }
}