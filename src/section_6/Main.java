package section_6;

public class Main {

    public static void main(String[] args) {
        Account bobsAccount = new Account();//"12345",0.0,"Bob",
//                "bobsemail@mail.com","098-123-45-67");
//        System.out.println(bobsAccount.getNumber());
//        System.out.println(bobsAccount.getBalance());
//        bobsAccount.withdraw(100);
//        bobsAccount.deposit(50);
//        bobsAccount.withdraw(100);
//        bobsAccount.deposit(51);
//        bobsAccount.withdraw(100);
//
//        Account romansAccount = new Account("Roman", "roman@email.com","12345");
//
//        System.out.println("Name is " + romansAccount.getCustomerName() + " account number is "+ romansAccount.getAccountPhoneNumber() + " " +
//                "number is " + romansAccount.getNumber());
//
//        VipCustomer vipCustomer = new VipCustomer();
//        System.out.println("vipcustomer name is " + vipCustomer.getName() + " email "+ vipCustomer.getEmail() +
//                "credit limit " + vipCustomer.getCreditLimit());
//
//        VipCustomer vipCustomer1 = new VipCustomer("name","100");
//        System.out.println("name is " + vipCustomer1.getName() + " email " + vipCustomer1.getEmail());
//
//        VipCustomer vipCustomer2 = new VipCustomer("name", "limit","email");
//        System.out.println("name is "+ vipCustomer2.getName() + " limit " + vipCustomer2.getCreditLimit() + " email " + vipCustomer2.getEmail());
//
//        Wall wall = new Wall(5,4);
//        System.out.println("area = " + wall.getArea());
//        wall.setHeight(-1.5);
//        System.out.println("width = " + wall.getWidth());
//        System.out.println("height = " + wall.getHeight());
//        System.out.println("area = " + wall.getArea());
//
//        Point first = new Point(6,5);
//        Point second = new Point(3,1);
//        System.out.println("distance(0.0) = " + first.distance());
//        System.out.println("distance(second) = " + first.distance(second));
//        System.out.println("distance (2.2) = " + first.distance(2,2));
//        Point point = new Point();
//        System.out.println("distance() = " + point.distance());
//
//        Carpet carpet = new Carpet(3.5);
//        Floor floor = new Floor(2.75, 4.0);
//        Calculator calculator = new Calculator(floor, carpet);
//        System.out.println("total = " + calculator.getTotalCost());
//        carpet = new Carpet(1.5);
//        floor = new Floor(5.4,4.5);
//        calculator = new Calculator(floor,carpet);
//        System.out.println(calculator.getTotalCost());
//
//        ComplexNumber one = new ComplexNumber(1.0,1.0);
//        ComplexNumber number = new ComplexNumber(2.5,-1.5);
//        one.add(1,1);
//        System.out.println("one real = " + one.getReal());
//        System.out.println("one imaginary = " + one.getImaginary());
//        one.subtract(number);
//        System.out.println("one.real = " + one.getReal());
//        System.out.println("one.imaginary = " + one.getImaginary());
//        number.subtract(one);
//        System.out.println("number.real = " + number.getReal());
//        System.out.println("number.imaginary = " + number.getImaginary());
//
//        Outlander outlander = new Outlander(36);
//        outlander.steer(45);
//        outlander.accelarate(30);
//        outlander.accelarate(20);
//        outlander.accelarate(-42);
//
//        Circle circle = new Circle(3.75);
//        System.out.println("circle.radius " + circle.getRadius());
//        System.out.println("circle.area " + circle.getArea());
//        Cylinder cylinder = new Cylinder(5.55,7.25);
//        System.out.println("cylinder.radius = " + cylinder.getRadius());
//        System.out.println("cylinder.height = " + cylinder.getHeight());
//        System.out.println("cylinder.area = " + cylinder.getArea());
//        System.out.println("cylinder.volume = " + cylinder.getVolume());

        Reactangle2 reactangle2 = new Reactangle2(5,10);
        System.out.println("reactangle.width = " + reactangle2.getWidth());
        System.out.println("reactangle.length = " + reactangle2.getLength());
        System.out.println("reactangle.area = " + reactangle2.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width = " + cuboid.getWidth());
        System.out.println("cuboid.length = " + cuboid.getLength());
        System.out.println("cuboid.height = " + cuboid.getHeight());
        System.out.println("cuboid.area = " + cuboid.getArea());
        System.out.println("cuboid.volume = " + cuboid.getVolume());



    }
}
