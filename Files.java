import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class A extends JFrame 
{
	public A() 
	{
		
		GridLayout g=new GridLayout(4,3);
		setLayout(g);
		try 
{
			FileInputStream fin = new FileInputStream("D:/emp.txt");
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
public class Table 
{
	public static void main(String[] args) 
	{
		A a = new A();
	}
}
