package section_7;

public class Microvawe {
    private String model;
    private String manufacturer;
    private int size;

    public Microvawe(String model, String manufacturer, int size) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
    }

    public void heatMeal() {
        System.out.println("Putting meal into the wave and heat");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }
}
