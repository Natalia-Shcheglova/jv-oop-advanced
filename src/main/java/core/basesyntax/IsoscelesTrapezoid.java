package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements GetArea, ToDraw {
    private int firstBase;
    private int secondBase;
    private int height;

    public IsoscelesTrapezoid(int firstBase, int secondBase, int height) {
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    public int getFirstBase() {
        return firstBase;
    }

    public void setFirstBase(int firstBase) {
        this.firstBase = firstBase;
    }

    public int getSecondBase() {
        return secondBase;
    }

    public void setSecondBase(int secondBase) {
        this.secondBase = secondBase;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) * height / 2;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: Isosceles Trapezoid, area: " + this.getArea()
                + ", firstBase: " + firstBase + ", secondBase: "
                + secondBase + ", height: " + height + ", color: " + this.getColor());
    }
}