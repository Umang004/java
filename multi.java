import java.util.Scanner;
public class multi
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int [2][2];

		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		int b[][]=new int [2][2];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		int multi=0;
		int c[][]=new int [2][2];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
				multi=0;
				for(int k=0;k<2;k++)
			{
					multi+=a[i][k] * b[k][j];
					c[i][j]=multi;

			System.out.print(c[i][j] + " ");	
			}
			System.out.println();
		}
	}
}
	