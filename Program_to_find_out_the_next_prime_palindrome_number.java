import java.util.Scanner;
class Solution
{
    public static int prime(int n)
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
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static int palindrome(int n)
    {
        int temp=n;
        int r,rev=0;
        while(n!=0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        n=temp;
        if(n==rev)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n+1;i!=0;i++)
        {
            if(prime(i)==1)
            {
                if(palindrome(i)==1)
                {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}