import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],s=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(x[i]==x[j])
                {
                    x[j]=1;
                }
            }
            if(x[i]%2==0 && x[i]!=1)
            {
                s+=x[i];
            }
        }
        System.out.print(s);
    }
}