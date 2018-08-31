package Task1;

class Rectangle extends Figure{
    private int length, height;

    Rectangle(int length, int height) {
        this.length = length;
        this.height = height;
    }

    @Override
    int figureArea() {
        return (this.length * this.height);
    }
}
