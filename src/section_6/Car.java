package section_6;

public class Car extends Vehicle {

    public Car(String name, String size) {
        super(name, size);
    }

    private int wheels;
    private int gears;
    private int doors;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int gears, int doors, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.gears = gears;
        this.doors = doors;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeVelociity(int speed, int direction) {
        System.out.println("Car.changeVelocity: Velocity " + speed + ", direction is " + direction);
        move(speed,direction);
    }

}
