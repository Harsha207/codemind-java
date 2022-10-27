import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<3)
        {
            System.out.printf("The pattern is not possible");
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<=i;j++)
                {
                    System.out.printf("*");
                }
                System.out.printf("
");
            }
            for(int i=1;i<n;i++)
            {
                for(int j=0;j<n-i;j++)
                {
                    System.out.printf("*");
                }
                System.out.printf("
");
            }
        }
    }
}