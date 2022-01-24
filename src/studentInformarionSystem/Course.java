package studentInformarionSystem;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int performanceNote;
    int performanceNotePercent;


    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        this.performanceNote = 0;
        this.performanceNotePercent = 0;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher; // Dışarıdan aldığımız teacher nesnesini içerideki teacher nesnesine eşitledik. Böylelikle teacher nesnesindeki özellikleri almış oluruz.
        } // Buradaki kontrol örneğin FZK bölümündeki öğretmen ile TRH prefixindeki öğretmenin aynı olmamasını istemektir.

        else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor.");
        }


    }

    void printTeacherInfo(){
        this.teacher.print();
    }
}
