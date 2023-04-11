import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    List<Student> students = new ArrayList<Student>();

    public void add(Student student) {
        if (isValid(student.getStudentNo(), student.getNationalityId()) == true) {
            students.add(student);
        } else {
            System.out.println("Sistemde böyle bir öğrenci kayıtlı.");
        }
    }

    public void list() {

        for (Student student : students) {
            System.out.println("Name:" + student.getFirstName() + " Surname:" + student.getLastName() + " No:" + student.getStudentNo() + " Id:" + student.getNationalityId() + " Group:" + student.getGroup());
        }

    }

    public void delete(Student student) {
        students.remove(student);
    }

    public boolean isValid(int studentNo, String nationalityId) {

        for (Student student : students) {
            if (student.getStudentNo() == studentNo || student.getNationalityId() == nationalityId) {
                return false;
            }
        }

        return true;

    }

}
