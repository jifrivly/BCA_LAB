import java.applet.*;
import java.awt.*;

public class AppletDemo extends Applet 
{
    int x,y,w,h,red,green,blue;
    public void init()
    {
        x = Integer.parseInt(getParameter("xcoordinate"));
        y = Integer.parseInt(getParameter("ycoordinate"));
        w = Integer.parseInt(getParameter("Width"));
        h = Integer.parseInt(getParameter("Height"));
        red = Integer.parseInt(getParameter("Red"));
        green = Integer.parseInt(getParameter("Green"));
        blue = Integer.parseInt(getParameter("Blue"));
        
    }
    public void paint (Graphics g) 
    {
        Color c = new Color(red,green,blue);
        g.setColor(c);
        g.fillRect(x, y,w,h);
    }
}