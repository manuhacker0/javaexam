import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* <applet code="DivisionApplet" width=500 height=500></applet> */
public class DivisionApplet extends Applet implements ActionListener
{
Label l1,l2,l3;
Button b1,b2;
TextField t1,t2,t3;
public void init()
{
l1=new Label("NUMBER1");
l2=new Label("NUMBER2");
l3=new Label("RESULT");
b1=new Button("COMPUTE");
b2=new Button("CLEAR");
t1=new TextField(30);
t2=new TextField(30);
t3=new TextField(30);
setLayout(new GridLayout(4,2));
add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);
add(b1);
add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent ob)
{
String exp;
float res=0;
if(ob.getSource()==b1)
{
float a=1,b=1;
 try
 {
 a=Integer.parseInt(t1.getText());
 b=Integer.parseInt(t2.getText());
 res=a/b;
t3.setText(""+res);
 }
 catch(ArithmeticException e1)
 {
 exp=e1.toString();
 t3.setText(exp);
 }
 catch(Exception e)
 {
 exp=e.toString();
 t3.setText(exp);
}
}
else
{
t1.setText("");
t2.setText("");
t3.setText("");
}
}
}
