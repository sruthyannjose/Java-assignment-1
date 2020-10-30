import java.util.Scanner;
class Prg8
{
    public static void main(String args[])
    {
        int i=1,n; int f=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to as a limit: ");
        n = sc.nextInt();
        while(i<n)
        {
        	for(i=1;i<=n;i++)
        	{
        		f*=i;
        		System.out.println("The Factorial of "+i+" is = "+f);
        	}
        }
    }
}