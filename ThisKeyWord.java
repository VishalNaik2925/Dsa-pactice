class Thiss{
    String name;
    int age;

    Thiss(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Name:"+this.name);
        System.out.println("Age:"+this.age);

    }
}

public class ThisKeyWord {
    public static void main(String[] args) {
        Thiss s1=new Thiss("Vishal",21);
        s1.display();
        Thiss s2=new Thiss("Rohit",22);
        s2.display();
    }
}
