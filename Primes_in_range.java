import java.util.Scanner;
class Solution
{
    public static int prime(int n)
    {
        if(n<2)
        {
            return 0;
        }
        else
        {
            for(int i=2;i*i<=n;i++)
            {
                if(n%i==0)
                {
                    return 0;
                }
            }
            return 1;
        }

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c=0;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(prime(i)==1)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}