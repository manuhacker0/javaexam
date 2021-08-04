import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* <applet code= "Calculator_Applet.class" width=500 height=500>
</applet> */
public class Calculator_Applet extends Applet implements ActionListener
{

Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,C,Mul,Add,Div,Min,Equ;
TextField tf;
String msg="",op;
int a,b,count=0;
public void init()
{
b1=new Button("1");
b2=new Button("2");
b3=new Button("3");
b4=new Button("4");
b5=new Button("5");
b6=new Button("6");
b7=new Button("7");
b8=new Button("8");
b9=new Button("9");
b0=new Button("0");
C =new Button("CLEAR");
Min=new Button("-");
Mul=new Button("X");
Add=new Button("+");
Div=new Button("/");
Equ=new Button("=");
tf=new TextField(300);

setLayout(new GridLayout(5,4));
add(b7);
add(b8);
add(b9);
add(C);
add(b4);
add(b5);
add(b6);
add(Add);
add(b1);
add(b2);
add(b3);
add(Min);
add(b0);
add(Div);
add(Mul);
add(Equ);
add(tf);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b0.addActionListener(this);
Add.addActionListener(this);
Mul.addActionListener(this);
Min.addActionListener(this);
Div.addActionListener(this);
C.addActionListener(this);
Equ.addActionListener(this);

}

public void actionPerformed(ActionEvent ob)
{
switch(ob.getActionCommand())
{
case "1" : msg=msg+1;
                  tf.setText(msg);
                  break;
case "2" : msg=msg+2;
                  tf.setText(msg);
                  break;
case "3" : msg=msg+3;
                  tf.setText(msg);
                  break;
case "4" : msg=msg+4;
                  tf.setText(msg);
                  break;
case "5" : msg=msg+5;
                  tf.setText(msg);
                  break;
case "6" : msg=msg+6;
                  tf.setText(msg);
                  break;
case "7" : msg=msg+7;
                  tf.setText(msg);
                  break;
case "8" : msg=msg+8;
                  tf.setText(msg);
                  break;
case "9" : msg=msg+9;
                  tf.setText(msg);
                  break;
case "0" : msg=msg+0;
                  tf.setText(msg);
                  break;

case "+" : if(count==0)
                  {
                   a=Integer.parseInt(tf.getText());
                   op="+";
                   tf.setText("");
                   msg="";
                   count++;
                   }
                   else
                   {
                   op="+";
                   b=Integer.parseInt(tf.getText());
                   operation(a,b,op);
                   tf.setText("");
                   msg="";
                   }
break;
case "-" : if(count==0)
                  {
                   a=Integer.parseInt(tf.getText());
                   op="-";
                   tf.setText("");
                   msg="";
                   count++;
                   }
                   else
                   {
                   op="-";
                   b=Integer.parseInt(tf.getText());
                   operation(a,b,op);
                   tf.setText("");
                   msg="";
                   }
break;
case "X" : if(count==0)
                  {
                   a=Integer.parseInt(tf.getText());
                   op="X";
                   tf.setText("");
                   msg="";
                   count++;
                   }
                   else
                   {
                   op="X";
                   b=Integer.parseInt(tf.getText());
                   operation(a,b,op);
                   tf.setText("");
                   msg="";
                   }
break;
case "/" : if(count==0)
                  {
                   a=Integer.parseInt(tf.getText());
                   op="/";
                   tf.setText("");
                   msg="";
                   count++;
                   }
                   else
                   {
                   op="/";
                   b=Integer.parseInt(tf.getText());
                   operation(a,b,op);
                   tf.setText("");
                   msg="";
                   }
break;
case "CLEAR" : a=0;
                           msg="";
                           tf.setText("");
                           count=0;
break;
              
case "=" : b=Integer.parseInt(tf.getText());
                  operation(a,b,op);
                  tf.setText(""+a);
                  break;
}
}
public void operation(int a1,int b1,String op1)
{
switch(op1)
{
case "+": a=a1+b1; break;
case "-": a=a1-b1; break;
case "X": a=a1*b1; break;
case "/": a=a1/b1; break;
}
}

}
