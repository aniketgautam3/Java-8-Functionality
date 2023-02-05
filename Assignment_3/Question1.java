package Assignment_3;

@FunctionalInterface  
interface Calc {
    
    int cube(int value);
    
    default int square(int value){
        return (value*value);
    }
    
    default int add(int a, int b){
        return (a+b);
    }
    
    static int sub(int a, int b) {
        return (a-b);
    }
    
    static int mul(int a, int b) {
        return (a*b);
    }
    
    static int div(int a, int b) {
        return (a/b);
    }
}


public class Question1 {
    public static void main(String[] args) {
        
        Calc c = (int val)-> val*val*val;
        System.out.println("Cube : " + c.cube(3));
        System.out.println("Sum of 6 and 7 is: "+c.add(6, 7));
        System.out.println("Diff of 6 and 7 is: "+Calc.sub(6, 7));
        System.out.println("Multiply of 6 and 7 is: "+Calc.mul(6, 7));
        System.out.println("Division of 6 and 3 is: "+Calc.div(6, 3));
        }
}
