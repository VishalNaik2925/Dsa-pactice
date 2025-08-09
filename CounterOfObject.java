class Circle {
    float Radius;
    static float PI = 3.14f;

    Circle(float Radius) {
        this.Radius = Radius;
    }

    void area(){
        System.out.println("Area of Circle is: " + (PI * Radius * Radius));
    }
    
    
}
public class CounterOfObject {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        c1.area();
    }
}
