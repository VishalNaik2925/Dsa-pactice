import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        char[] Name2= new char[6];
        Name2[0]='V';
        Name2[1]='I';
        Name2[2]='S';
        Name2[3]='H';
        Name2[4]='A';
        Name2[5]='L';
        System.out.println("Name is: "+new String(Name2));

        char[] Name={'V','I','S','H','A','L'};
        System.out.println("Name is: "+new String(Name));

        int arr[]={1,2,3,4,5};
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(i);
        }
        Arrays.sort(arr);
        System.out.println("Max Number in arr:"+arr[arr.length-1]);

    }
}
