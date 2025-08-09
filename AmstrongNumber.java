public class AmstrongNumber {
    public static void main(String[] args) {
        //Write a Java program to check whether a given number is an Armstrong number or not.Example: 153 → Armstrong
        int number = 153; // Example number
        int temp = number;
        int sum = 0;
        int digits = String.valueOf(number).length();
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
