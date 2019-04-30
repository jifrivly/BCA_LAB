import java.applet.*;
import java.awt.*;
public class SmileyDemo extends Applet
{
    public void paint(Graphics g)
    {
        g.drawOval(60,60,200,200);
        g.fillOval(90,120,50,20);
        g.fillOval(190,120,50,20);
        g.drawLine(165,160,165,200);
        g.drawArc(115,130,95,95,0,-180);
    }
}