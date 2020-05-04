public class Pillar {
    private Geomertry botton;
    private double height;

    public Pillar(){};
     public Pillar(Geomertry b,double h){
         botton=b;
         height=h;
     }

    public Geomertry getBotton() {
        return botton;
    }

    public void setBotton(Geomertry botton) {
        this.botton = botton;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVoliume(){
         return getHeight()*botton.getArea();
    }

    @Override
    public String toString() {
        return "这个柱体的体积是"+getVoliume();
    }
}
