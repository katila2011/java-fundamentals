package classActivity;

public class Student extends Person {

    //we put this here to take care of edge cases that can come up
    public Student(){
    }
    public Student (String fullName, int age){
        super (fullName,age);
    }

    @Override
    void display() {
        System.out.println("Student Details: " + getFullName() + getAge());
    }

}
