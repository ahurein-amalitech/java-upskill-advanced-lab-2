package design_patterns.factory.shape;

public class Main {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.createShape("circle");
        circle.draw();

        Shape square = ShapeFactory.createShape("square");
        square.draw();
    }
}
