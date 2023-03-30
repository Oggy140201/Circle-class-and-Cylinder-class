import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);
        Circle c2 = new Circle(6,"Red");
        System.out.println(c2);
        c1.setRadius(5);
        c1.setColor("Blue");
        System.out.println("c1 co mau " + c1.getColor());
        System.out.println(c1);

        Cylinder c3 = new Cylinder();
        System.out.println(c3);
        Cylinder c4 = new Cylinder(6);
        System.out.println(c4.getLength());
        c3.setLength(10);


c4.setRadius(5);
        System.out.println(c1.getArea());

        System.out.println(c4.getVolum());
    }
}