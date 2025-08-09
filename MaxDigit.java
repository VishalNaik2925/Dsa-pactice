public class MaxDigit {
    public static void main(String[] args) {
        int num=987;
        int MaxDigit=0;
        
        while(num>0){
            int lastDigit=num%10;
            if(lastDigit>MaxDigit){
                MaxDigit=lastDigit;
            }
            num=num/10;

        }
        System.out.println("Maximum Digit is: " + MaxDigit);
    }
}
