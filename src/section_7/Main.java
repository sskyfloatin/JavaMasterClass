package section_7;

public class Main {

    public static void main(String[] args) {
//        Dimensions dimensions = new Dimensions(20,5,20);
//
//        Case theCase = new Case("220B", "Dell", "240", dimensions);
//
//        Monitor monitor = new Monitor("27 inch Beast", "Acer", 27, new Resolution(2540,1440));
//
//        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v.2.44");
//
//        PC thePC = new PC(theCase, monitor, motherboard);
//        thePC.powerUp();
//
//        Kitchen kitchen = new Kitchen(2,1,8,3, new Refrigerator("S200-H","Bosh",175, 2),
//                new Microvawe("G200", "Gorenje", 10));
//        kitchen.prepareMeals();
//
//        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Bob",50,"Sword");
//        enhancedPlayer.getHealth();

        Printer  printer = new Printer(70,true);
        System.out.println("Toner current level is " + printer.getTonerPercentageLevel());
        printer.addToner(35);
        int pagesPrinted = printer.printPage(6);
        System.out.println("Pages to print was " + pagesPrinted + ", total amount of printed pages is " + printer.getPagesPrinted());
        System.out.println("Toner current level is " + printer.getTonerPercentageLevel());
        pagesPrinted = printer.printPage(3);
        System.out.println("Pages to print was " + pagesPrinted + ", total amount of printed pages is " + printer.getPagesPrinted());
    }
}
