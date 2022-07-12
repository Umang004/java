import java.util.Scanner;
public class swap{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number 1 :");
		int	a=sc.nextInt();

		System.out.println("enter number 2 :");
		int b=sc.nextInt(); 

		int temp=a;
		a=b;
		b=temp;

		System.out.println("enter number 1:"+a);
		System.out.println("enter number 2:"+b);
		
		


	}
}