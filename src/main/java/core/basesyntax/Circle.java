package core.basesyntax;

public class Circle extends Figure implements GetArea, ToDraw {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: circle, area: " + this.getArea() + ", radius: "
                + radius + ", color: " + this.getColor());
    }
}