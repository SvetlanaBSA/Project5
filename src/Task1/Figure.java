package Task1;

class Figure {
    int lenght = 0, height = 0, side1 = 0, side2 = 0, side3 = 0, radius = 0, area = 0;
    double pi = 3,14;
    //конструктор для квадрата
    Figure (int lenght){
        this.lenght = lenght;
        figureArea();
    }

    //конструктор для прямоугольника
    Figure (int lenght, int height) {
        this.lenght = lenght;
        this.height = height;
        figureArea();
    }
    //конструктор для Треугольника
    Figure (int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        figureArea();
    }
    //конструктор для круга
    Figure (int radius, double pi) {
        this.radius = radius;
        this.pi = pi;
        figureArea();
    }

    //метод "расчета площади"
    int figureArea() {
        return area;
    }
    void print() {
        System.out.println("S = " + figureArea());
    }
}
