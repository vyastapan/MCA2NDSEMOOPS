public class bird {
    String b1;
    String b2;

    bird(String b1) {
        this.b1 = b1;

    }

    void display() {
        System.out.println(b1);

    }

}

class ass3 {
    public static void main(String[] args) {
        bird obj= new bird("pigeon");
        bird obj2=new bird("Parrot");
        obj.display();
        obj2.display();
    }

        
}
