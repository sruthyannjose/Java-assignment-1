import java.util.Scanner;
import java.lang.Math;
class Prg10
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int c=0,d,r=0,n1=n,n2=n;
        while(n1!=0)
        {
            int d1 = n1%10;
            c++;
            n1/= 10;
        }
        while(n!=0)
        {
            d = n%10;
            r+=Math.pow(d,c);
            n/= 10;
        }
        if(r==n2)
          System.out.println("Entered number is Armstrong");
        else
          System.out.println("Entered number is Not Armstrong");
    }
}