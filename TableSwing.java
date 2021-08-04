import java.io.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
class A extends JFrame
{
 A()
 {
 
 GridLayout g=new GridLayout(6,3);
 setLayout(g);
 try
 {
 FileInputStream fin = new FileInputStream("student.txt
");
 Scanner sc = new Scanner(fin);
 StringTokenizer st;
 String a;
 while (sc.hasNextLine())
 {
 a=sc.nextLine();
 st=new StringTokenizer(a,","); 
 while(st.hasMoreTokens())
 {
 
 add(new JLabel(st.nextToken()));
 }
 }
 }
 catch (Exception ex)
 {
 }
 
 setSize(400,400);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setVisible(true);
 }
}
public class TableSwing
{
 public static void main(String[] args)
 {
 A a = new A();
 }
}
