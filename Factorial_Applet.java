import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* <applet code="Factorial_Applet.class" width=500 height=500 ></applet> */
public class Factorial_Applet extends Applet  implements ActionListener
{
Label l1,l2;
Button b1,b2;
TextField tf1,tf2;
public void init()
{
l1=new Label("Enter your Input here :");
l2=new Label("The Output is :");
b1=new Button("Compute");
b2=new Button("Clear");
tf1=new TextField(300);
tf2=new TextField(300);
setLayout(new GridLayout(3,2));
add(l1);
add(l2);
add(tf1);
add(tf2);
add(b1);
add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
}

public void actionPerformed(ActionEvent ob)
{
String s=ob.getActionCommand();
String s1="Compute";
if(s.equals(s1))
{
int a=Integer.parseInt(tf1.getText());
int fact=1;
for(int i=1;i<=a;i++)
{
fact=fact*i;
}

tf2.setText(""+fact);
}
else
{
tf1.setText("");
tf2.setText("");
}

}
}
