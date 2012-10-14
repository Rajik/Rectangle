import junit.framework.Assert;
import org.junit.Test;

public class RectangleGraphicTest
{
@Test

public void shouldReturnGraphicalRepresentationOfARectangle()

{
        Rectangle rect;
        RectangleGraphic rectGraphic;

        int l=5;
        int b=3;
        rect=new Rectangle(5,3);
        rectGraphic=new RectangleGraphic();
        String expected="*****\n*   *\n*****";
        String actual=rectGraphic.drawRectangle(rect,"*");

       Assert.assertEquals(expected,actual);


    }
}


