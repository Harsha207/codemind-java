import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            int max=0;
            for(int j=i+1;j<n;j++)
            {
                if(max<x[j])
                {
                    max=x[j];
                }
            }
            System.out.format("%d ",max);
        }
        System.out.print("-1");
    }
}