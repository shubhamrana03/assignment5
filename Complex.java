import java.util.Scanner;
public class Complex
{
  public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 int real,imaginary ;
 System.out.println("Enter real number");
 real = in.nextInt();
 System.out.println("Enter imaginary number");

 imaginary  = in.nextInt();
 
 Display a1 = new Display(real,imaginary);
}
}



class Display
{
 Display(int r, int s)
{
 System.out.println(r+"+ "+s+"i");

}
}
