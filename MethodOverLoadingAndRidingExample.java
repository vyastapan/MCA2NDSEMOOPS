class OverloadingExample {
    public void display(int num) {
        System.out.println("Number: " + num);
    }

    public void display(String str) {
        System.out.println("String: " + str);
    }

    public OverloadingExample() {
        System.out.println("Default constructor");
    }

    public OverloadingExample(int num) {
        System.out.println("Parameterized constructor with int: " + num);
    }

    public OverloadingExample(String str) {
        System.out.println("Parameterized constructor with String: " + str);
    }
}

public class MethodOverLoadingAndRidingExample {
    public static void main(String[] args) {
        OverloadingExample obj1 = new OverloadingExample();
        OverloadingExample obj2 = new OverloadingExample(10);
        OverloadingExample obj3 = new OverloadingExample("Hello");

        obj1.display(5);
        obj2.display("World");
    }
}
