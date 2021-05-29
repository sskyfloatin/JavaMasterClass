package section_6;

public class Outlander extends Car {
    private int roadServiceMonths;


    public Outlander(int roadServiceMonths) {
        super("Outlander", "4WD", 5, 6, 5, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelarate(int rate) {
        int newVelociity = getCurrentVelocity() + rate;
        if(newVelociity == 0) {
            stop();
            changeGear(1);
        } else if (newVelociity > 0 && newVelociity <=10) {
            changeGear(1);
        } else if (newVelociity > 10 && newVelociity <=20) {
            changeGear(2);
        } else if (newVelociity > 20 && newVelociity <= 30) {
            changeGear(3);
        } else {
            changeGear(4);
        }
        if (newVelociity > 0) {
            changeVelociity(newVelociity,getCurrentDirection());
        }
    }
}
