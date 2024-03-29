class Calculator {
  
    public Calculator() {
    }


    public int add(int a, int b) {
        return a + b;
    }


    public double add(double a, double b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }
}

public class TestApp {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sumInt = calc.add(5, 3);
        double sumDouble = calc.add(5.5, 3.5);
        int productInt = calc.multiply(5, 3);
        double productDouble = calc.multiply(5.5, 3.5);

        System.out.println("Sum (int): " + sumInt);
        System.out.println("Sum (double): " + sumDouble);
        System.out.println("Product (int): " + productInt);
        System.out.println("Product (double): " + productDouble);
    }
}
