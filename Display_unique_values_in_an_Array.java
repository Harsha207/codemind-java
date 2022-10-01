import java.util.Scanner;
class Solution
{
    public static void uniqueelements(int x[])
    {
        int i,j,f=0;
        for(i=0;i<x.length;i++)
        {
            int c=0;
            if(x[i]!=-999)
            {
                for(j=i+1;j<x.length;j++)
                {
                    if(x[i]==x[j])
                    {
                        x[j]=-999;
                        c+=1;
                    }
                }
                if(c==0)
                {
                    System.out.print(x[i]+" ");
                    f=1;
                }
            }
        }
        if(f==0)
        {
            System.out.println("-1");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        uniqueelements(x);
    }
}