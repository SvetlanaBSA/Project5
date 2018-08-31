package Task1;

class Square extends Figure {
    private int length;

    Square(int length) {
        this.length = length;
    }

    @Override
    int figureArea() {
        return (this.length * this.length);
    }
}
