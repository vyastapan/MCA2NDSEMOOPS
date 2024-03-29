class dog{
    String name;
    String breed;
    dog(){
        name = "no name";
        breed = "no breed";
    }
    
    dog(String name){
        this.name = name;
        breed = "no breed";
    }
    
    dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }
    
    void show(){
        System.out.println("Name : " + this.name + "\n\n");
    }
    void show(String name){
        System.out.println("Name : " + name + "\n\n");
    }
    void show(String name,String breed){
        System.out.println("Name : " + name + "\nBreed : " + breed + "\n\n");
    }
    
}

public class MyClass{
    public static void main(String[] args){
        dog obj1 = new dog();
        dog obj2 = new dog("Tom");
        dog obj3 = new dog("obj3","fool");
        
        obj1.show();
        obj2.show("TOM");
        obj3.show("obj3", "fool");
    }
}
