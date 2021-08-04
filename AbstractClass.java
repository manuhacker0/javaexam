import java.util.*;
abstract class Shape
{
 int l, b, r;
 Scanner input = new Scanner(System.in);
 abstract void printArea();
}
class Rectangle extends Shape
{
 void printArea()
 {
 System.out.println("Enter length and breadth of rectangle
: ");
 l = input.nextInt();
 b = input.nextInt();
 System.out.println("The area of Rectangle is: " + (l * b))
;
 }
}
class Triangle extends Shape
{
 void printArea()
 {
 System.out.println("Enter Base And Height of triangle : ")
;
 l = input.nextInt();
 b = input.nextInt();
 System.out.println("The area of Triangle is: " + (l * b) /
2);
 }
}
class Circle extends Shape
{
 void printArea()
 {
 System.out.println("Enter Radius of circle : ");
 r = input.nextInt();
 System.out.println("The area of Circle is: " + (3.14f * r
* r));
 }
}
public class AbstractClass
{
 public static void main(String[] args)
 {
 Rectangle rec = new Rectangle();
 rec.printArea();
 Triangle tri = new Triangle();
 tri.printArea();
 Circle cir = new Circle();
 cir.printArea();
 }
}
