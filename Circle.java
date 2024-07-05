import java.util.*;
class Circle
{
public static void main(String args[])
{
final float PI=3.14f;
System.out.println("Enter the Radius");
Scanner sc=new Scanner(System.in);
/*sc->reference variable in java..scanner() can pass prameters too.*/
float radius=sc.nextFloat();
float area=PI*radius*radius;
float perimeter=2*PI*radius;
System.out.println("Area of the Circle: "+area);
System.out.println("Perimeter of the Circle: "+perimeter);
}
}