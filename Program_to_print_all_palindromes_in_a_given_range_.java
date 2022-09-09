import java.util.Scanner;
class Solution
{
    public static int reverse(int n)
    {
        int r,rev=0;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        return rev;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n;
        m=sc.nextInt();
        n=sc.nextInt();
        for(int i=m;i<=n;i++)
        {
            if(i==reverse(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}