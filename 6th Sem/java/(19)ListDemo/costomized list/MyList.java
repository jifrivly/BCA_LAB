
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MyList extends Applet implements ActionListener
{
    TextField edit1,edit2;
    Button b1,b2;
    List list;

    public MyList()
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
            Color black = new Color(0, 0, 0);
            Color red = new Color(255, 0, 0);            
            edit2.setForeground(black);
            item = edit2.getText();

            if (item.equals("")){
                edit2.setForeground(red);
                edit2.setText("Enter something");
            }
            else{
                int i,count = list.getItemCount();
                for (i = 0; i < count; i++) {
                    if (item.equals(list.getItem(i)))
                    {
                        list.remove(item);
                        edit2.setText("");
                        break;
                    }
                }
                if ( i == count) {
                    edit2.setForeground(red);
                    edit2.setText(item + " not exist");
                }
            }
        }
    }
}
