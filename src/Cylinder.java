public class Cylinder extends  Circle{
    private double length;

    public Cylinder(){
    }

    public Cylinder(double length){
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getVolum(){
        return Math.PI*super.getRadius()*length;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "length=" + length +
                '}';
    }
}
