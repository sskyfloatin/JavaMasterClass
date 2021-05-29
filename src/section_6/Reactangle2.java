package section_6;

public class Reactangle2 {

    private double width;
    private double length;

    public Reactangle2(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else
        this.width = width;
        if(length < 0) {
            this.length = 0;
        } else
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return getLength() * getWidth();
    }
}
