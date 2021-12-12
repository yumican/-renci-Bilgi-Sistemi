public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mr.Jackson", "+90556412281", "Mat");
        Teacher t2 = new Teacher("Mss.Beth", "+90552344356", "Fiz");
        Teacher t3 = new Teacher("Mss.Karen", "+90556787653", "Bio");


        Course mat = new Course("Matematik","101","Mat");
        Course fiz = new Course("Fizik","101","Fiz");
        Course bio = new Course("Biologhy","101","Bio");
        mat.addTeacher(t1);
        fiz.addTeacher(t2);
        bio.addTeacher(t3);

        Student s1 = new Student("ahmet", "123", "5.sınıf", mat, fiz, bio);
        s1.addBulkExamNote(80,100,76);
        s1.printNote();
        s1.isPass();





    }
}







