import util.Scanner;
class Prg2
{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number:");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("The sum of entered numbers is: "+(a+b));
    }
}