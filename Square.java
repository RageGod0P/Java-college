import java.util.*;

interface Shape{
    public void area();

}
class Rectangle implements Shape{
    float l,b;
    Rectangle(float l, float b){
        this.l=l;
        this.b=b;
    }
    public void area(){
        float a=l*b;
        System.out.println("The area of rectangle = "+a);
    }
    void dis(){
        System.out.println("The length is "+l+" and breadth is "+b);
    }
}
class Circle implements Shape{
    float r;
    Circle(float r){
        this.r=r;
    }
    public void area(){
        float a=3.14f*r*r;
        System.out.println("The area of Circle is = "+a);
    }
    void dis(){
        System.out.println("The radius is "+r);
        area();
    }
}
class Square extends Rectangle implements Shape{
    float s;
    Square(float s, float l, float b){
        super(l,b);
        this.s=s;
    }
    public void area(){
        float a=s*s;
        System.out.println("The area of Square = "+a);
    }
    void dis(){
        super.dis();
        System.out.println("The side is "+s);
        super.area();
        this.area();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        float r=sc.nextFloat();
        System.out.println("Enter the Side of square and lenght and breadth of the rectangle");
        float s=sc.nextFloat();
        float l=sc.nextFloat();
        float b=sc.nextFloat();
        Circle c=new Circle(r);
        Rectangle sq=new Square(s,l,b);
        c.dis();
        sq.dis();
        sc.close();

    }
}