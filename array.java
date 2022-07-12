import java.util.Scanner;
public class array{
	public static void main(String[]args){
		int[]a=new int[5];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<5;i++)
			a[i]=input.nextInt();
		System.out.println("a[i]"); 
	}
}
