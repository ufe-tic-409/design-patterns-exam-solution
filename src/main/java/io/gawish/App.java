package io.gawish;

public class App
{
    public static void main( String[] args )
    {
        Canvas canvas = new Canvas();

        Rectangle s1 = new Rectangle();
        Circle s2 = new Circle();
        Triangle s3 = new Triangle();

        Group g1 = new Group();
        Group g2 = new Group();

        g1.addElement(s1);
        g1.addElement(s2);

        g2.addElement(s3);
        g2.addElement(g1);

        canvas.addShape(s1);
        canvas.addShape(s2);
        canvas.addShape(s3);

        canvas.draw();

        System.out.println(g1);
        System.out.println(g2);

        s1.setWidth(10);
    }
}
