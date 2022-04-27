package core.basesyntax;

public class Square extends Figure implements GetArea, ToDraw {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: Square, area: " + this.getArea()
                + ", side: " + side + ", color: " + this.getColor());
    }
}