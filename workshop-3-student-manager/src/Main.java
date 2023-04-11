public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("İbrahim","Yıldırım",1,"12345","Developer");
        Student student2 = new Student("Deneme","Deneme",2,"12321","Developer");
        Student student3 = new Student("Deneme2","Deneme2",3,"12315","Developer");


        StudentManager studentManager = new StudentManager();

        studentManager.add(student1);
        studentManager.add(student2);
        studentManager.add(student3);


        studentManager.list();

    }
}