package design_patterns.decorator.shape;

public class ColoredBorderDecorator extends ShapeDecorator{
    private final String color;

    public ColoredBorderDecorator(Shape decorated, String color) {
        super(decorated);
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Adding color: " + color);
        this.decorated.draw();
    }
}
