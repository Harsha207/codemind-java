import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,j;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
            {
                int c=0;
                for(j=0;j<n;j++)
                {
                    if(i!=j)
                    {
                        if(x[i]>x[j])
                        {
                            c+=1;
                        }
                    }
                }
                System.out.print(c+" ");
            }
    }
}