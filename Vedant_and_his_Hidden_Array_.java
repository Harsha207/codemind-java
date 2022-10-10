import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a,b;
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            if(a==1)
            {
                if(b%2==0)
                {
                    System.out.println("Even");
                }
                else
                {
                    System.out.println("Odd");
                }
            }
            else if(b%2==0)
            {
                System.out.println("Impossible");
            }
            else
            {
                if(a%2==0)
                {
                    System.out.println("Even");
                }
                else
                {
                    System.out.println("Odd");
                }
            }
        }
    }
}