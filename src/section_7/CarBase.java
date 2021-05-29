package section_7;

public class CarBase {
    private boolean engine;
    private int wheels;
    private String model;
    private int cylinders;

    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            CarBase car = randomCar();
            System.out.println("Car #" + i + " : " + car.getModel() + "\n" +
                    "Perform action: " + car.startEngine() + "\n");
        }
    }

    public static CarBase randomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random car generated was " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Mazda();
            case 2:
                return new Skoda();
            case 3:
                return new Volkswagen();
        }
        return null;
    }

    public CarBase(String model, int cylinders) {
        this.engine = true;
        this.model = model;
        this.wheels = 4;
        this.cylinders = cylinders;
    }

    public String getModel() {
        return model;
    }

    public int getCylinders() {
        return cylinders;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public String  startEngine() {
        return "Car engine is being started!";
    }

    public String accelerate() {
        return "Car is being accelerated!";
    }

    public String brake() {
        return "Car is being braked!";
    }
}

class Mazda extends CarBase{
    public Mazda() {
        super("626", 4);
    }

    @Override
    public String startEngine() {
        return "Mazda is being started engine!";
    }

    @Override
    public String accelerate() {
        return "Mazda is being accelarated!";
    }

    @Override
    public String brake() {
        return "Mazda is being braked!";
    }
}

class Skoda extends CarBase {
    public Skoda() {
        super("Fabia", 4);
    }

    @Override
    public String startEngine() {
        return "Skoda is being started engine!";
    }

    @Override
    public String accelerate() {
        return "Skoda is being accelerated!";
    }

    @Override
    public String brake() {
        return "Skoda is being brakeed!";
    }
}

class Volkswagen extends CarBase {
    public Volkswagen() {
        super("Golf 7", 4);
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.startEngine();
    }

    @Override
    public String brake() {
        return super.startEngine();
    }
}
