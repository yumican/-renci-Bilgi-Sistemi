import java.sql.SQLOutput;

public class Course {

    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note = 0;


    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;

    }


    void addTeacher(Teacher teacher) {
        this.teacher=teacher;
        if(this.prefix.equals(teacher.branch)){
            this.teacher=teacher;
        }else {
            System.out.println("Dersle öğretmeni uyuşmuyor.");
        }




    }
    void printTeacher(Teacher teacher){
        System.out.println("Adı: "+this.teacher.name);
        System.out.println("Numara: "+this.teacher.mpno);
        System.out.println("Dersi: "+this.teacher.branch);

    }
}











