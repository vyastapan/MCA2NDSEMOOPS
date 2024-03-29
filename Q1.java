class Student {
    String name;
    String rollNumber;
    String phoneNumber;
    String address;

     Student(String name, String rollNumber, String phoneNumber, String address) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    
    void display(){
        System.out.println("Student Information:");
        System.out.println("Sam - Roll Number: " + this.rollNumber);
        System.out.println("     Phone Number: " + this.phoneNumber);
        System.out.println("     Address: " + this.address);
    }  
}

public class MyClass {
    public static void main(String[] args) {
        
        Student sam = new Student("Sam", "S001", "1234567890", "House");
        Student john = new Student("John", "J001", "9876543210", "Other house");

        
        sam.display();
        john.display();
    }
}
