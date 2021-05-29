package section_6;

public class Cuboid extends Reactangle2 {
    private double height;

    public Cuboid(double width, double length,double height) {
        super(width,length);
        if(height < 0) {
            height = 0;
        } else
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getHeight() * getArea();
    }
}
