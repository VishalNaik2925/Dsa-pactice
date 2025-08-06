public class ProductOfDigit {
    public static void main(String[] args) {
        int n=25;
        int prod=1;
        while(n>0){
            int lastDigit=n%10;
            prod*=lastDigit;
            n=n/10;
        }System.out.println(prod);
    }
}
