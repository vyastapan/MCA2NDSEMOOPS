public class Overloading {
    private int num1;
    private int num2;

    public Overloading() {
        this.num1 = 0;
        this.num2 = 0;
    }

    public Overloading(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        return num1 + num2;
    }

    public int add(int num3) {
        return num1 + num2 + num3;
    }

    public int add(int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

    public static void main(String[] args) {
        Overloading example1 = new Overloading();
        Overloading example2 = new Overloading(5, 10);

        System.out.println("Addition with no parameters: " + example1.add());
        System.out.println("Addition with two parameters: " + example2.add());
        System.out.println("Addition with three parameters: " + example2.add(15));
        System.out.println("Addition with four parameters: " + example2.add(20, 25));
    }
}