public class Reverse {
    public static void main(String[] args) {

        int n=125;
        while (n>0) {
            int last=n%10;
            System.out.print(last);
            n=n/10;
        }
        
    }
}
