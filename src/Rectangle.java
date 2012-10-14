import java.util.ArrayList;

//Understand that it has 4 sides and 4 right angles with opposite sides equal
public class Rectangle {

    private int length;
    private int width;

    public Rectangle(int length,int width)
    {
        this.length=length;
        this.width=width;
    }

    public int getLength()
    {
        return length;

    }

    public int getWidth()
    {
        return width;
    }

    public int area()
    {
        return length*width;
    }

    public int perimeter() {
        return 2*(length+width);
    }


}
