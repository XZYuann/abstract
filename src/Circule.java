public class Circule extends Geomertry{
    private double r;

    public Circule(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return 3.14*r*r;
    }
}
