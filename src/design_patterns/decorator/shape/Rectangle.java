package design_patterns.decorator.shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw a rectangle");
    }
}
