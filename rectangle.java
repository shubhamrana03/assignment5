import java.util.Scanner;
public class rectangle 
{
  public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 double a,b;
 double c;
 System.out.println("Enter both the sides of rectangle");
 a = in.nextDouble();
 b = in.nextDouble();
 c= a*b;
 CalculateArea a1 = new CalculateArea(c);
}
}



class CalculateArea
{
 CalculateArea(double r)
{
 System.out.println(r);

}
}
