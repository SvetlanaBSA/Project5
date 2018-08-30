package Task1;

class Circle extends Figure {
    @Override
    int figureArea(){
        super.area = (int) (super.pi * Math.pow(super.radius, super.radius));
        return super.area;
    }
}
