import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a,b,x[],i;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
          x[i]=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        int s=0;
        for(i=0;i<n;i++)
        {
            if(x[i]>=a && x[i]<=b)
            {
                s+=x[i];
            }
        }
        System.out.println(s);
    }
}