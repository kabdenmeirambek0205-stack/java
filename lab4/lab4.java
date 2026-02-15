public class lab4 {

    // 1,2,3 тапсырма: Student классы
    static class Student {
        String name;
        int age;
        String major;

        // Әдепкі конструктор
        public Student() {
            this.name = "Белгісіз";
            this.age = 18;
            this.major = "Белгісіз";
            System.out.println("Әдепкі конструктор шақырылды");
        }

        // Параметрлі конструктор
        public Student(String name, int age, String major) {
            this.name = name;
            this.age = age;
            this.major = major;
            System.out.println("Параметрлі конструктор шақырылды");
        }

        // Объект туралы ақпаратты шығаратын әдіс
        public void displayInfo() {
            System.out.println("Аты: " + name);
            System.out.println("Жасы: " + age);
            System.out.println("Мамандығы: " + major);
        }

        // 5 тапсырма: мамандықты өзгерту әдісі
        public void setMajor(String major) {
            this.major = major;
        }
    }

    // 7 тапсырма: Course классы
    static class Course {
        String courseName;

        public Course(String courseName) {
            this.courseName = courseName;
        }

        public void enrollStudent(Student s) {
            System.out.println(s.name + " курсына тіркелді: " + courseName);
        }
    }

    public static void main(String[] args) {

        // 4 тапсырма: бірнеше объект жасау
        Student s1 = new Student("Аян", 19, "IT");
        Student s2 = new Student("Меруерт", 20, "Economics");
        Student s3 = new Student(); // әдепкі конструктор

        System.out.println("-----");
        s1.displayInfo();
        System.out.println("-----");
        s2.displayInfo();
        System.out.println("-----");
        s3.displayInfo();

        // 5 тапсырма: объекттің күйін өзгерту
        s3.setMajor("Mathematics");
        System.out.println("-----");
        s3.displayInfo();

        // 7 тапсырма: курстың студентпен әрекеті
        Course javaCourse = new Course("Java Programming");
        javaCourse.enrollStudent(s1);

        // 8 тапсырма: объект өмірлік циклі (түсініктемеде көрсетілген)
        // s1, s2, s3 объектілері құрылды → қолданылды → бағдарлама аяқталғанда жадыдан өшеді
    }
}