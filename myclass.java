class MyClass {
    int value;

    public MyClass() {
        value = 0;
    }

    public MyClass(int val) {
        value = val;
    }

    public void display() {
        System.out.println("Value: " + value);
    }

    public void display(int num1, int num2) {
        System.out.println("Sum: " + (num1 + num2));
    }

    public void display(double num1, double num2) {
        System.out.println("Product: " + (num1 * num2));
    }
}

public class overloading_eg {
   public static void main(String[] args) {
       
       MyClass obj1 = new MyClass(); 
       MyClass obj2 = new MyClass(4); 


       obj1.display(); 
       obj2.display(); 
       obj1.display(3, 2); 
       obj2.display(2.5, 7.9);
    }
}