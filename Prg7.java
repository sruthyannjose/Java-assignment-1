import java.util.Scanner;
class Prg7
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        int first=0,second=1;
        System.out.print("First " +n+ " terms::   ");

        for(int i=1;i<=n;i++)
        {
            System.out.print(first+"\t");

            int sum = first+second;
            first = second;
            second = sum;
        }
    }
}