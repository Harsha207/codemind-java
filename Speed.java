import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int p=0;p<t;p++)
        {
            int n=sc.nextInt();
            int x[],i;
            x=new int[n];
            for(i=0;i<n;i++)
            {
                x[i]=sc.nextInt();
            }
            int c=0;
            for(i=0;i<n-1;i++)
            {
                if(x[i+1]<x[i])
                {
                    c+=1;
                }
            }
            System.out.println(c+1);
        }
    }
}