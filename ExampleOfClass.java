class Student {
    String name;
    int rollNumber;
    String phoneNumber;
    String address;


    public Student(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

 
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
    }
}

public class ExampleOfClass {
    public static void main(String[] args) {

        Student sam = new Student("Sam");
        Student john = new Student("John");

        sam.setRollNumber(101);
        sam.setPhoneNumber("1234567890");
        sam.setAddress("delhi");

        john.setRollNumber(102);
        john.setPhoneNumber("9876543210");
        john.setAddress("Jersey");

        sam.printDetails();
        john.printDetails();
    }
}
