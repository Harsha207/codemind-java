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
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=2;i<(int)Math.sqrt(n)+1;i++)
        {
            if(prime(i)==1)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}