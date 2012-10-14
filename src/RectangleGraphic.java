import org.apache.commons.lang.StringUtils;

public class RectangleGraphic {


    public String drawRectangle(Rectangle rect, String symbol)
    {
        String output="";

        int length=rect.getLength();
        int width=rect.getWidth();

        String topLine=StringUtils.repeat(symbol,length)+"\n";
        String bottomLine= StringUtils.repeat(symbol,length);
        String middleLines="";
        for(int i=1;i<width-1;i++)
        {
            middleLines+=symbol+StringUtils.repeat(" ",length-2)+symbol+"\n";
        }

        output=topLine+middleLines+bottomLine;
        return output;

    }

}

