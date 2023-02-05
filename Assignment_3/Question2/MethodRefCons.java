package Assignment_3.Question2;

@FunctionalInterface
interface MyInterface{
    Person getPerson(String Name , int age);
}
public class MethodRefCons {
    public static void main(String[] args) {
        
        MyInterface obj = Person :: new;
        
        System.out.println("Person Name " + obj.getPerson("Aniket Gautam" , 22).getName() + "\nAge"+ obj.getPerson("Aniket Gautam" , 22).getAge() );
    }
}
