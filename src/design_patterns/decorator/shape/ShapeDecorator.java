package design_patterns.decorator.shape;

public abstract class ShapeDecorator implements Shape {
    protected Shape decorated;

    public ShapeDecorator(Shape decorated) {
        this.decorated = decorated;
    }

    @Override
    public void draw() {
        this.decorated.draw();
    }
}
