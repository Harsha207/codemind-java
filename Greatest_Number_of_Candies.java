import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],k;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        k=sc.nextInt();
        int max=x[0];
        for(int i=0;i<n;i++)
        {
            if(x[i]>max)
            {
                max=x[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            int m=0;
            m=x[i]+k;
            if(m>=max)
            {
                System.out.print("True ");
            }
            else
            {
                System.out.print("False ");
            }
        }
    }
}