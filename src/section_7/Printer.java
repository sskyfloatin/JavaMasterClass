package section_7;

public class Printer {
    private int tonerPercentageLevel = 50;
    private int pagesPrinted;
    private boolean isDuplex;

    public void addToner(int addLevel) {
        if(addLevel >= 0 && addLevel <= 100) {
            this.tonerPercentageLevel += addLevel;
        }
        else {
            this.tonerPercentageLevel = -1;
        }
        if(this.tonerPercentageLevel > 100) {
            this.tonerPercentageLevel = 100;
        }
    }

    public int printPage(int pages) {
        int pagesToPrint = pages;
        if(this.isDuplex) {
            pagesToPrint = (pages / 2) + pages % 2;
            System.out.println("Printing in duplex mode.");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public Printer(int tonerPercentageLevel, boolean isDuplex) {
        if(tonerPercentageLevel >= 0 && tonerPercentageLevel <= 100) {
            this.tonerPercentageLevel = tonerPercentageLevel;
        }
        else {
            this.tonerPercentageLevel = -1;
        }
        this.isDuplex = isDuplex;
        this.pagesPrinted = 0;
    }

    public int getTonerPercentageLevel() {
        return tonerPercentageLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
