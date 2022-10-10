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
            int x[],s=0;
            x=new int[n];
            for(int i=0;i<n-1;i++)
            {
                x[i]=sc.nextInt();
            }
            for(int i=0;i<n-1;i++)
            {
                s+=x[i];
            }
            int to=n*(n+1)/2;
            System.out.println(to-s);
        }
    }
}