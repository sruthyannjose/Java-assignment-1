import java.util.Scanner;
class Prg9
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int d,r=0,n1=n;
        while(n!=0)
        {
            d = n%10;
            r = (r*10)+d;
            n/=10;
        }
        if(r==n1)
            System.out.println("Entered number is Palindrome");
        else
            System.out.println("Entered number is Not Palindrome");
    }
}