import java.util.Scanner;
class Prg3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n%2==0)
            System.out.println("\nThe entered number ("+n+") is an even number.");
        else
            System.out.println("\nThe entered number ("+n+") is an odd number.");
    }
}