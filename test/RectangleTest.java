import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

//Ensures the properties of a rectangle are correct on given input
public class RectangleTest {

    Rectangle rect;


    @Test
    public void shouldReturnAreaOf3X2()
    {
        rect = new Rectangle(3,2);
        assertEquals(6,rect.area());
    }

    @Test
    public void shouldReturnArea4X2()
    {
        rect = new Rectangle(4,2);
        assertEquals(8,rect.area());

    }

    @Test
    public void shouldReturnPerimeterOf3X2()
    {
        rect = new Rectangle(3,2);
        assertEquals(10, rect.perimeter());
    }

    @Test
    public void shouldReturnPerimeterOf6X4()
    {
        rect = new Rectangle(6,4);
        assertEquals(20, rect.perimeter());
    }


}

