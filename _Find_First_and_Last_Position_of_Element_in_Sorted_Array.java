import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[];
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        int f=0;
        for(int i=0;i<n;i++)
        {
            if(x[i]==t)
            {
                System.out.print(i+" ");
                f=1;
                break;
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            if(x[i]==t)
            {
                System.out.print(i);
                break;
            }
        }
        if(f==0)
        {
            System.out.println("-1 -1");
        }
    }
}