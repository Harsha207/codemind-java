import java.util.Scanner;
class Solution
{
    public static boolean prime(int n)
    {
        int j,k=0;
        for(j=1;j<=n;j++)
        {
            if(n%j==0)
            {
                k+=1;
            }
        }
        if(k==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[],s=0,c=0;
        x=new int[n];
        for(int i=0;i<n;i++)
         x[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(prime(x[i]))
            {
                s+=x[i];
                c+=1;
            }
        }
        float a=(float)s/c;
        System.out.printf("%.2f",a);
    }
}