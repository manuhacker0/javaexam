import java.util.Random;
class Number extends Thread
{
public void run ()
{
Random r=new Random();
for(int i=0;i<5;i++)
{
int val=r.nextInt(50);
System.out.println("Integer generated : "+val);
if(val%2==0)
{
Square s= new Square(val);
s.start();
}
else
{
Cube c =new Cube(val);
c.start();
}
try
{
sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
}

class Square extends Thread
{
int x;
Square(int n)
{
x=n;
}
public void run()
{
System.out.println("Square of integer generated :"+(x*x));
}
}


class Cube extends Thread
{
int y;
Cube(int n)
{
y=n;
}
public void run()
{
System.out.println("Cube of integer generated :"+(y*y*y));
}
}



class Random_Square_Cube 
{
public static void main(String r[])
{
Number ob=new Number ();
ob.start();
}
}
