package classActivity;

abstract public class Person {
    private String fullName;
    private int age;
    public Person(){
    }
    public Person (String fullName,int age){
        this.fullName = fullName;
        this.age = age;
    }
    public String getFullName(){
        return fullName;
   }
   public int getAge(){
        return age;
   }
   abstract void display();
}
