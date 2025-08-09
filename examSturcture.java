
class Reactangle{
    int lenqth;
    int breadth;

    Reactangle(int length,int breadth){
        this.lenqth=length;
        this.breadth=breadth;
    }
    void area(){
        System.out.println("Area of Rectangle is: " + (this.lenqth * this.breadth));
    }
}


public class examSturcture {
    public static void main(String[] args) {
        Reactangle r1 = new Reactangle(10, 5);
        r1.area();
    }
}
