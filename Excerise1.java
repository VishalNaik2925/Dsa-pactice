class user {
    String name;
    String location;
    String ocupation;
    long phoneNo;
    static int count = 0;

    public user() {
        count++;
    }
}

public class Excerise1 {
    public static void main(String[] args) {
        user u1 = new user();
        user u2 = new user();
        
        u1.name = "Alice";
        u1.location = "New York";
        u1.ocupation = "Software Engineer";
        u1.phoneNo = 1234567890L;

        System.out.println("User 1 Details:");
        System.out.println("Name: " + u1.name);
        System.out.println("Location: " + u1.location);
        System.out.println("Occupation: " + u1.ocupation);
        System.out.println("Phone No: " + u1.phoneNo);
        System.out.println("Total users created: " + user.count);
    }
}
