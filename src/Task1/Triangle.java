package Task1;

class Triangle extends Figure {
    private int side1, side2, side3;

    Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    int figureArea(){
        int p = this.side1 + this.side2 + this.side3;
        return (int) (Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3)));
    }
}
