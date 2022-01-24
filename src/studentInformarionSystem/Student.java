package studentInformarionSystem;

public class Student {
    Course course1;
    Course course2;
    Course course3;
    String studentName;
    String studentNumber;
    String classes;
    double average;
    double performanceAverage;
    boolean isPass;

    Student(String studentName, String studentPhoneNumber, String classes, Course course1, Course course2, Course course3) {
        this.studentName = studentName;
        this.studentNumber = studentPhoneNumber;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = 0.0;

        this.course1.performanceNotePercent = 30;
        this.course2.performanceNotePercent = 40;
        this.course3.performanceNotePercent = 50;

        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3, int performanceAverage) {
        if(note1 >= 0 && note1 <= 100){
            course1.note = note1;
        }

        if(note2 >= 0 && note2 <= 100){
            course2.note = note2;
        }

        if(note3 >= 0 && note3 <= 100){
            course3.note = note3;
        }


    }

    void addPerformanceGrades(int course1performanceGrade, int course2PerformanceGrade, int course3PerformanceGrade) {
        if(course1performanceGrade >= 0 && course1performanceGrade <= 100) {
            this.course1.performanceNote = course1performanceGrade;
        }

        if(course2PerformanceGrade >= 0 && course2PerformanceGrade <= 100) {
            this.course2.performanceNote = course2PerformanceGrade;
        }

        if(course3PerformanceGrade >= 0 && course3PerformanceGrade <= 100) {
            this.course3.performanceNote = course3PerformanceGrade;
        }
    }

    void isPass() {
        this.course1.note = (this.course1.performanceNote * this.course1. performanceNotePercent / 100) + (this.course1.note * (100 - this.course1.performanceNotePercent) / 100);
        this.course2.note = (this.course2.performanceNote * this.course2.performanceNotePercent / 100) + (this.course2.note * (100 - this.course2.performanceNotePercent) / 100);
        this.course3.note = (this.course3.performanceNote * this.course3.performanceNotePercent / 100) + (this.course3.note * (100 - this.course3.performanceNote) / 100);

        this.average = (this.course1.note + this.course2.note + this.course3.note) / 3.0;
        if(this.average > 55) {
            System.out.println("Hababam sınıfı uyanıyor :)");
            this.isPass = true;
        }else{
            System.out.println("Hababam sınıfı sınıfta kaldı :(");
            this.isPass = false;
        }
        printNote();

    }

    void printNote(){
        System.out.println("Öğrenci Adı Soyadı: " + this.studentName);
        System.out.println(this.course1.name + " Notu: " +this.course1.note);
        System.out.println(this.course1.name +  " Sözlü Notu: " + this.course1.performanceNote);
        System.out.println();

        System.out.println(this.course2.name + " Notu: " +this.course2.note);
        System.out.println(this.course2.name +  " Sözlü Notu: " + this.course2.performanceNote);
        System.out.println();

        System.out.println(this.course3.name + " Notu: " +this.course3.note);
        System.out.println(this.course3.name +  " Sözlü Notu: " + this.course3.performanceNote);
        System.out.println();

        System.out.println("Ortalamanız: " +this.average);
    }


}
