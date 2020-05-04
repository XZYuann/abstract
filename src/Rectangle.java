public class Rectangle extends Geomertry{
    private double l;
    private  double w;

    public Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    @Override
    public double getArea() {
        return w*l;
    }
}
