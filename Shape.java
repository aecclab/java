 abstract class Shape
{
abstract void numberofsides();
}
class Rectangle extends Shape
{
void numberofsides()
{
System.out.println("No.of sides:4");
}
}
class Triangle extends Shape
{
void numberofsides()
{
System.out.println("No.of sides:3");
}
}
class Hexagon extends Shape
{
void numberofsides()
{
System.out.println("No.of sides:6");
}
}
class Test
{
public static void main(String[] args)
{
Rectangle r=new Rectangle();
r.numberofsides();
Triangle t=new Triangle();
t.numberofsides();
Hexagon h=new Hexagon();
h.numberofsides();
}
}
