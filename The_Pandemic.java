import java.util.Scanner;
class Pandemic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if (n==2)
        {
            System.out.println('1');
        }
        else if(n==1)
        {
            System.out.println('0');
        }
        else
        {
            System.out.println('2');
        }
    }
}