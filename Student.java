public class Student {

    String name;
    String stuNo;
    String classes;
    Course bio;
    Course mat;
    Course fiz;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course bio, Course mat, Course fiz){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.bio =bio;
        this.mat=mat;
        this.fiz=fiz;
        this.avarage=0.0;
        this.isPass=false;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 <= 100 && note1 >= 0) {
            this.bio.note = note1;
        }
        if (note2 <= 100 && note2 >= 0) {
            this.mat.note = note2;
        }
        if (note3 <= 100 && note3 >= 0) {
            this.fiz.note = note3;
        }
    }
    void printNote(){
        System.out.println(bio.name+" notu: "+ this.bio.note);
        System.out.println(mat.name+" notu: "+this.mat.note);
        System.out.println(fiz.name+" notu: "+this.fiz.note);
        System.out.println("Ortalamanız: " + this.avarage);
    }

    void isPass(){
        this.avarage = (this.bio.note + this.mat.note + this.fiz.note)/3;
        if( 55<this.avarage){
            System.out.println("Başarıyla geçtiniz.");
            isPass=true;
        }else
            System.out.println("Kaldınız.");

        printNote();
    }


















}
