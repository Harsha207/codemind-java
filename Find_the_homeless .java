import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],y[],c,c1=0;
        n=sc.nextInt();
        x=new int[n];
        y=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            y[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            c=1;
            for(int j=0;j<n;j++)
            {
                if(x[i]<=y[j])
                {
                    y[j]=0;
                    c=0;
                    break;
                }
            }
            if(c!=0)
            {
                c1+=1;
            }
        }
        System.out.println(c1);
    }
}