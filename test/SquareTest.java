import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



//Ensures the properties of square
public class SquareTest {

    Square square;

    @Before
    public void setUp()
    {
        square=new Square(5);
    }

    @Test
    public void shouldReturnArea25forSide5()
    {
        Assert.assertEquals(25, square.area());

    }

    @Test
    public void shouldReturnPerimeter20forSide5()
    {
        Assert.assertEquals(20,square.perimeter());
    }
}


