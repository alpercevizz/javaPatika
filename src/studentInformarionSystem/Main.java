package studentInformarionSystem;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 =new Teacher("Mahmut Hoca", "90111 111 1111", "TRH");
        Teacher teacher2 = new Teacher("Graham Bell", "0000", "FZK");
        Teacher teacher3 = new Teacher("Külyutmaz", "1111", "BIO");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(teacher1);

        System.out.println();

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(teacher2);

        System.out.println();

        Course biyo = new Course("Biyoloji", "101", "BIO");
        biyo.addTeacher(teacher3);

        Student s1 = new Student("İnek Şaban", "123", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(100, 40, 70, 20);
        s1.addPerformanceGrades(80, 70, 100);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "444", "4", tarih, fizik, biyo);
        s2.addBulkExamNote(50, 30, 70, 30);
        s2.addPerformanceGrades(75, 85, 90);
        s2.isPass();
    }
}
