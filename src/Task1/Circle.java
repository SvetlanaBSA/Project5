package Task1;

final class Circle extends Figure {
    private int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    int figureArea(){
        return (int) (3.14 * Math.pow(this.radius, 2));
    }
}
