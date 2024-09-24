package classActivity;

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher nwaTeacher = new Teacher("John Doe",45);
        Student student = new Student ("Aya Stark", 17);
        nwaTeacher.display();
        student.display();
    }
}
