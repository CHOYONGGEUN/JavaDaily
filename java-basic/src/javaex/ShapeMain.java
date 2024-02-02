package javaex;

//부모 클래스
abstract class Shape{
    public String type;

    public Shape(String type){
        this.type = type;
    }
    public abstract void draw();
}

//자식 클래스
class Circle extends Shape{
    public double radius;

    public Circle(String type, double radius){
        super(type);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + type + "with radius " + radius);
    }
}
class Rectangle extends Shape{
    public double width;
    public double height;

    public Rectangle(String type, double width, double height){
        super(type);
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw(){
        System.out.println("Drawing a " + type + "with radius " + width);
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        Shape circle = new Circle("circle ", 5.0);
        Shape rectangle = new Rectangle("rectangle ", 4.0,3.0);

        circle.draw();
       rectangle.draw();

    }
}
