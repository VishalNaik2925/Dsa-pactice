class ArmstrongChecker {
    int number;

    // Constructor
    public ArmstrongChecker(int number) {
        this.number = number;
    }

    // Method to check Armstrong
    public boolean isArmstrong() {
        int temp = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == number;
    }
}

public class Excerise2 {
    public static void main(String[] args) {
        ArmstrongChecker ac = new ArmstrongChecker(153); // Example number
        if (ac.isArmstrong()) {
            System.out.println(ac.number + " is an Armstrong number.");
        } else {
            System.out.println(ac.number + " is not an Armstrong number.");
        }
    }
}