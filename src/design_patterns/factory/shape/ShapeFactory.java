package design_patterns.factory.shape;

public class ShapeFactory {
    public static Shape createShape(String shapeType) {
        return switch (shapeType.toLowerCase()) {
            case "circle" -> new Circle();
            case "square" -> new Square();
            default -> throw new IllegalArgumentException("Invalid shape type: " + shapeType);
        };
    }
}
