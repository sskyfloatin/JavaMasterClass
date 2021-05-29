package section_6;

public class Point {

    private int y;
    private int x;

    public Point() {
    }

    public Point(int x, int y) {
        this.y = y;
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) +
                (y - this.y) * (y - this.y));
    }

    public double distance() {
        return distance(0,0);
    }

    public double distance(Point another) {
        return distance(another.x, another.y);
    }

}
