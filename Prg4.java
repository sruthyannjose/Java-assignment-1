import java.util.Scanner;
class Prg4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i = 2;
        boolean b = false;
        while(i<=n/2)
        {
            if(n%i==0)
            {
                b = true;
                break;
            }
                ++i;
        }
        if (!b)
            System.out.println(n + " is a Prime Number.");
        else
            System.out.println(n + " is Not a Prime Number.");
    }
}