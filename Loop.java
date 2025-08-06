import java.util.Scanner;

class Loop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        System.out.println("Odd Number");
        int m=sc.nextInt();
        for(int i=1;i<=m;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }


        int o=sc.nextInt();
        int sum=0;
        for(int i=1;i<=o;i++){
            sum=sum+i;
        }System.out.println("Sum is:"+sum);

        int p=sc.nextInt();
        int fact=1;
        for(int i=1;i<=p;i++){
            fact=fact*i;
        }System.out.println("Factorial is:"+fact);

        //program for give number is isprime simple code
        int q=sc.nextInt();
        boolean isPrime = true;
        if (q <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(q); i++) {
                if (q % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(isPrime ? "Prime" : "Not Prime");
        
        //print the prime number from 2 to w
        int w = sc.nextInt();
        System.out.println("Prime numbers from 2 to " + w + ":");
        for (int i = 2; i <= w; i++) {
            boolean isPrimeNum = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrimeNum = false;
                    break;
                }
            }
            if (isPrimeNum) {
                System.out.println(i);
            }
        }
    }
}