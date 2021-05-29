package section_7;

public class Refrigerator {

    private String model;
    private String manufacturer;
    private int height;
    private int width;

    public Refrigerator(String model, String manufacturer, int height, int width) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.height = height;
        this.width = width;
    }

    public void getProducts() {
        System.out.println("Opening refrigerator and getting products.");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
