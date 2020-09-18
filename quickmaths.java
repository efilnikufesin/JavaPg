import java.awt.*;
import java.util.Random;

interface Shape{
    void getPerimiter(String figure, double a,double b, double c);
}

class Quickmaths{
    public static void main(String[] args) {
        RandomFigs figures = new RandomFigs();
        String[] listfigures = figures.getRandom();
        for (int i = 0; i < listfigures.length; i++){
            Random r = new Random();
            double a = 10*r.nextDouble();
            double b = 10*r.nextDouble();
            double c = 10*r.nextDouble();
            figures.getPerimiter(listfigures[i],a,b,c);
            figures.printState();
        }
    }
}
class RandomFigs implements Shape{
    String figurePerimiter;
    private String[] figlist = new String[10];
    private String[] figs = {"Triangle", "Circle", "Rectangle"};
    public String[] getRandom() {
        for (int i = 0; i < figlist.length; i++) {
            int index = new Random().nextInt(figs.length);
            figlist[i] = figs[index];
        }
        return figlist;
    }
    @Override
    public void getPerimiter(String figure, double a, double b, double c) {
        if (figure == "Circle") {
            double p = 2*a*3.14;
            figurePerimiter = figure + " equals to" + p;
        }
        if (figure == "Rectangle"){
            double p = a+b+c;
            figurePerimiter = figure + " equals to " + p;
        }else {
            double p = 2*(a+b);
            figurePerimiter = figure + " equals to " + p;
        }
    }
    public void printState() {
        System.out.println("Perimiter for " + figurePerimiter);
    }
}