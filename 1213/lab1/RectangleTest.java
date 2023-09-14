import java.awt.Rectangle;

public class RectangleTest {

    public static void main(String[] args){
        Rectangle box1 = new Rectangle(10,10,40,30);
        System.out.println("box1: " + box1);
        Rectangle box2 = new Rectangle(100, 50);
        System.out.println("box2: " + box2);
        box1.setLocation(20, 20);
        box2.setSize(50, 30);
        System.out.println("box1: "+ box1 + " box2: " + box2);
        Rectangle box3 = box1.intersection(box2);
        //double box3Width = box3.getWidth();
        //double box3Height = box3.getHeight();
        //double box3Area = box3Height * box3Width;
        double box3A = box3.getWidth() * box3.getHeight();
        System.out.println("Area of box3 is: " + box3A);
        System.out.println("box3: " + box3);
    }

}
