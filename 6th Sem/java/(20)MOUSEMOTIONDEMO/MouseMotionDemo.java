import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MouseMotionDemo extends Applet implements MouseMotionListener
{
    Label l;
    public void init()
    {
        l = new Label();
        add(l);
        addMouseMotionListener(this);
    }

    public void mouseDragged(MouseEvent a)
    {
        
    }

    public void mouseMoved(MouseEvent e)
    {
        int x,y;
        x=e.getX();
        y=e.getY();
        l.setText("Mouse Coordinates : "+x+","+y);
    }
}