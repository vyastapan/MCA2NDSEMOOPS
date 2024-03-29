public class Student {
    private String name;
    private String rollNumber;
    private String phoneNumber;
    private String address;

    public Student(String name, String rollNumber, String phoneNumber, String address) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public static void main(String[] args) {

        Student sam = new Student("Sam", "01", "1234567890", "Bihar");
        Student john = new Student("John", "02", "9876543210", "Bisalpur");

        System.out.println("Details of Sam:");
        System.out.println("Roll Number: " + sam.getRollNumber());
        System.out.println("Phone Number: " + sam.getPhoneNumber());
        System.out.println("Address: " + sam.getAddress());

        System.out.println("\nDetails of John:");
        System.out.println("Roll Number: " + john.getRollNumber());
        System.out.println("Phone Number: " + john.getPhoneNumber());
        System.out.println("Address: " + john.getAddress());
    }
}
