import javax.swing.*;
import java.awt.*;
//import javax.swing.event.*;
import java.awt.event.*;
class A extends MouseAdapter
{
JFrame f= new JFrame("Mouse Events");
JLabel l1;
public A()
{
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(400, 400);
f.setLayout(new FlowLayout());
l1 = new JLabel();
Font fo = new Font("Verdana", Font.BOLD,20);
l1.setFont(fo);
l1.setForeground(Color.BLUE);
l1.setAlignmentX(Component.CENTER_ALIGNMENT);
l1.setAlignmentY(Component.CENTER_ALIGNMENT);
f.add(l1);
f.addMouseListener(this);
f.setVisible(true);
}
public void mouseExited(MouseEvent m)
{
l1.setText("Mouse Exited");
}
public void mouseEntered(MouseEvent m)
{
l1.setText("Mouse Entered");
}
public void mouseReleased(MouseEvent m)
{
l1.setText("Mouse Released");
}
public void mousePressed(MouseEvent m)
{
l1.setText("Mouse Pressed");
}
public void mouseClicked(MouseEvent m)
{
l1.setText("Mouse Clicked");
}
}
public class MouseEvents
{
public static void main(String[] args) {
A a = new A();
}
}
