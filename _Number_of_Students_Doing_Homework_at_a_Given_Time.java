import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,i,x[],y[],c=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        m=sc.nextInt();
        y=new int[m];
        for(i=0;i<m;i++)
        {
            y[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(i=0;i<m;i++)
            {
                if(x[i]<=k && y[i]>=k)
                {
                    c+=1;
                }
            }
        }
        System.out.println(c);
    }
}