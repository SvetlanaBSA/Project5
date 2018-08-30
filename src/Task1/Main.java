package Task1;

public class Main {
    public static void main(String[] args) {
        int lenght = 5;
        Figure figureS = new Figure(lenght);
        System.out.println(figureS.print());

        Figure figureR = new Figure(5, 10);
        System.out.println(figureS.print());

        Figure figureT = new Figure(3,4,5);
        System.out.println(figureS.print());

        Figure figureC = new Figure(3, 3.14);
        System.out.println(figureS.print());
    }
}
