import java.util.Scanner;
class Prg6
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
                System.out.print(i+"\t");
        }
    }
}