import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ListDemo extends Applet implements ActionListener
{
    TextField edit1,edit2;
    Button b1,b2;
    List list;

    public ListDemo()
    {
        setLayout(new FlowLayout());
        edit1=new TextField(20);
        b1=new Button("Add");
        list = new List(20);
        edit2=new TextField(20);
        b2=new Button("Remove");
        add(edit1);
        add(b1);
        add(edit2);
        add(b2);
        add(list);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        String str=e.getActionCommand();
        String item;
        if(str.equals("Add"))
        {
            item=edit1.getText();
            list.add(item);
            edit1.setText("");
        }
        if(str.equals("Remove"))
        {
            item=edit2.getText();
            list.remove(item);
            edit2.setText("");
        }
    }
}
