package design_patterns.decorator.shape;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape blueCircle = new ColoredBorderDecorator(circle, "blue");

        System.out.println("Plain Circle:");
        circle.draw();

        System.out.println("Circle with Red Border:");
        blueCircle.draw();
    }
}
