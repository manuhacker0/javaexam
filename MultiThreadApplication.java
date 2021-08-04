import java.util.Random;
class Thread1 extends Thread
{
 Thread1()
 {
 start();
 }
 public void run()
 {
 Random rand = new Random();
 for(int i=0;i<=10;i++)
 {
 int n = rand.nextInt(100);
 System.out.println("Generated number : "+n);
 if(n%2==0)
 {
 Thread2 ob = new Thread2(n);
 ob.start();
 }
 else
 {
 Thread3 ob = new Thread3(n);
 ob.start();
 }
 try{
 Thread.sleep(1000);
 }
 catch(InterruptedException e)
 {
 System.out.println("Interrupted Exception caught")
;
 }
 }
 }
} 
class Thread2 extends Thread
{
 int n;
 Thread2(int n)
 {
 this.n=n;
 }
 public void run()
 {
 System.out.println("Square of the number is : "+(n*n));
 }
}
class Thread3 extends Thread
{
 int n;
 Thread3(int n)
 {
 this.n=n;
 }
 public void run()
 {
 System.out.println("Cube of the number is : "+(n*n*n));
 }
}
class MultiThreadApplication {
 public static void main(String s[])
 {
 Thread1 ob = new Thread1();
 }
}
