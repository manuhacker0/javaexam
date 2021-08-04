import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
class A extends JFrame implements ItemListener
{
JRadioButton b1,b2,b3;
JLabel l1,l2,l3;
ButtonGroup j;
A()
{
setSize(500,500);
setLayout(new GridLayout(3,2));
b1= new JRadioButton("GREEN");
b1.setBackground(Color.green);
b2= new JRadioButton("RED");
b2.setBackground(Color.red);
b3= new JRadioButton("YELLOW");
b3.setBackground(Color.yellow);
l1=new JLabel();
l2=new JLabel();
l3=new JLabel();
j=new ButtonGroup();

l1.setForeground(Color.GREEN);
l2.setForeground(Color.RED);
l3.setForeground(Color.YELLOW);
l1.setOpaque(true);
l2.setOpaque(true);
l3.setOpaque(true);
l1.setBackground(Color.BLACK);
l2.setBackground(Color.BLACK);
l3.setBackground(Color.BLACK);

j.add(b1);
j.add(b2);
j.add(b3);
add(b1);
add(l1);
add(b2);
add(l2);
add(b3);
add(l3);



b1.addItemListener(this);
b2.addItemListener(this);
b3.addItemListener(this);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
setVisible(true); 


}

public void itemStateChanged(ItemEvent e)
{
JRadioButton jb=(JRadioButton)e.getSource();
switch(jb.getText())
{
case "GREEN" : l1.setText("YOU CAN GO!");
                            l2.setText("");
                            l3.setText("");
                             break;
case "RED" : l2.setText("STOP!");
                            l1.setText("");
                            l3.setText("");
                             break;
case "YELLOW" : l3.setText("WAIT!");
                                l2.setText("");
                            l1.setText("");
                             break;
}
}

}
class Traffic_Lights_Lab
{
public static void main(String arg[])
{
A ob=new A();
}
}
