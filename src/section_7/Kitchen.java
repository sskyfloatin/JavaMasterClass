package section_7;

public class Kitchen {

    private int windows;
    private int doors;
    private int square;
    private int height;
    private Refrigerator refrigerator;
    private Microvawe microwave;

    public Kitchen(int windows, int doors, int square, int height, Refrigerator refrigerator, Microvawe microvawe) {
        this.windows = windows;
        this.doors = doors;
        this.square = square;
        this.height = height;
        this.refrigerator = refrigerator;
        this.microwave = microvawe;
    }

    public void prepareMeals() {
        refrigerator.getProducts();
        cookMeal();
    }

    public void cookMeal() {
        microwave.heatMeal();
    }

    public int getWindows() {
        return windows;
    }

    public int getDoors() {
        return doors;
    }

    public int getSquare() {
        return square;
    }

    public int getHeight() {
        return height;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public Microvawe getMicrovawe() {
        return microwave;
    }
}
