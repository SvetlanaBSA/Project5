package Task1;

class Triangle extends Figure {
    @Override
    int figureArea(){
        int p = super.side1 + super.side2 + super.side3;
        super.area = (int) (Math.sqrt(p * (p - super.side1) * (p - super.side2) * (p - side3)));
        return super.area;
    }
}
