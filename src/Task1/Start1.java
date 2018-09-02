package Task1;

public class Start1 {
    public static void main(String[] args) {
        Square figureS = new Square(5);
        System.out.println("S = " + figureS.figureArea());

        Rectangle figureR = new Rectangle(5, 10);
        System.out.println("S = " + figureR.figureArea());

        Triangle figureT = new Triangle(3,4,5);
        System.out.println("S = " + figureT.figureArea());

        Circle figureC = new Circle(3);
        System.out.println("S = " + figureC.figureArea());

    }
}
