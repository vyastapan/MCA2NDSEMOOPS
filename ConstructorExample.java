class Bird {
    String name;

    public Bird() {
        System.out.println("Unknown bird");
    }

    public Bird(String name) {
        this.name = name;
        System.out.println("Bird name: " + name);
    }

    public Bird(String name, String species) {
        this.name = name;
        System.out.println("Bird name: " + name + ", Species: " + species);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Bird unknownBird = new Bird();
        Bird sparrow = new Bird("Sparrow");
        Bird eagle = new Bird("Eagle", "Hawk");
    }
}
