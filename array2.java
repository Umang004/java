import java.util.Scanner;
class array2
{
	public static void main(String[]args)
	{
		int arr[]=new int[4];
		Scanner sc=new Scanner(System.in);

		for(int i=0;i<4;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.println("enter no of a : ");
		int a=sc.nextInt();
		System.out.println("enter no of b : ");
		int b=sc.nextInt();	

		for(int i=0;i<4;i++)
		{
			if(arr[i]==a)
			{
				arr[i]=b;
				System.out.println("index"+i);
			}
			
		}
		for(int i=0;i<4;i++)
		{
			System.out.println(arr[i]);
		}
		
		}
	}


	
Footer
© 2022 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
