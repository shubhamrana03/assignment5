import java.util.Scanner;
public class seclo
{

	public static void main(String[] args)
	{

		int[] marr = new int[10];
	int a = marr[0];
	int b = marr[0];
       int i;
Scanner in = new Scanner(System.in);

	System.out.println("Elements for array " );
 
     for(i=0;i<10;i++)
{
  marr[i]=in.nextInt();
}
		for ( i = 0; i < 10; i++) {
			System.out.print(marr[i]+" \n");
		}
		for ( i = 0; i < 10; i++) {

			if (marr[i] > a) {
				b = a;
				a = marr[i];

			} else if (marr[i] > b) {
				b = marr[i];

			}
		}

		System.out.println("Second array is"+b);

	}
}