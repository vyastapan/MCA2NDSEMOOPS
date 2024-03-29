class Bird {
    String name;

    public Bird() {
        this.name = "Unknown";
    }
    public Bird(String name) {
        this.name = name;
    }
    public Bird(String name1, String name2) {
        this.name = name1 + " " + name2;
    }

    public void display() {
        System.out.println("Bird's name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Bird bird1 = new Bird();
        Bird bird2 = new Bird("Sparrow");
        Bird bird3 = new Bird("Blue", "Jay");

        bird1.display();
        bird2.display();
        bird3.display();
    }
}
