package max3;
import java.util.Scanner;
public class Max3 {
	public static void main(String [] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a=scan.nextInt();
		System.out.print("Enter first number: ");
		int b=scan.nextInt();
		System.out.print("Enter first number: ");
		int c=scan.nextInt();
		int max=b;
		if(a>b) {
			max=a;
		}
		if(c>max) {
			max=c;
			
		}
		System.out.println("The maximum of those 3 numbers is: "+max);
		scan.close();
	}
}
