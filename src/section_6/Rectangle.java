package section_6;

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    //Constructor Chaining

    //1st constructor
    public Rectangle() {
        this(0,0); //calls 2nd constructor
    }


    //2nd constructor
    public Rectangle(int width, int height) {
        this(0,0,width,height); //calls 3rd constructor
    }

    //3rd constructor initialize all variables
    public Rectangle(int x,int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

}
