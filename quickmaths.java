import java.awt.*;
import java.util.Random;

interface Shape{
    void getPerimiter(int indx);
}

class Quickmaths{
    public static void main(String[] args) {
        RandomFigs figlist = new RandomFigs();
        String[] figures = figlist.getRandom();
        for(int i=0;i < figures.length;i++) {
            if (figures[i] == "Triangle"){
                Triangle triangle = new Triangle();
                triangle.getPerimiter(i);
            }
            if (figures[i] == "Rectangle"){
                Rectangle rectangle = new Rectangle();
                rectangle.getPerimiter(i);
            }
            if (figures[i] == "Circle"){
                Circle circle = new Circle();
                circle.getPerimiter(i);
            }
        }
    }
}

class RandomFigs{
    private String[] figlist = new String[10];
    private String[] figs = {"Triangle", "Circle", "Rectangle"};
    public String[] getRandom() {
        for (int i = 0; i < figlist.length; i++) {
            int index = new Random().nextInt(figs.length);
            figlist[i] = figs[index];
        }
        return figlist;
    }
}

class Triangle implements Shape {
    Random r = new Random();
    double a = 10*r.nextDouble();
    double b = 10*r.nextDouble();
    double c = 10*r.nextDouble();
    @Override
    public void getPerimiter(int indx){
        double p = a+b+c;
        System.out.println("Triangle number " + indx + " perimiter equals " + p);
    }
}
class Rectangle implements Shape {
    Random r = new Random();
    double a = 10*r.nextDouble();
    double b = 10*r.nextDouble();
    @Override
    public void getPerimiter(int indx){
        double p = 2*(a+b);
        System.out.println("Rectangle number " + indx + " perimiter equals " + p);
    }
}
class Circle implements Shape {
    Random r = new Random();
    double a = 10*r.nextDouble();
    @Override
    public void getPerimiter(int indx){
        double p = 3.14*2*a;
        System.out.println("Circle number " + indx + " perimiter equals " + p);
    }
}