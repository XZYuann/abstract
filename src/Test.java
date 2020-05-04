public class Test {
    public static void main(String[] args) {
        Geomertry g;

        g=new Circule(5);
        Pillar p=new Pillar(g,10);
        System.out.println(p.toString());

        g=new Rectangle(3,4);
        p=new Pillar(g,10);
        System.out.println(p.toString());

        g=new Triangle(3,4);
        p=new Pillar(g,10);
        System.out.println(p.toString());


    }
}
