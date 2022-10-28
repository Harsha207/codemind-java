import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r,n,m,i,s=0,f=1;
        n=sc.nextInt();
        m=n;
        while(m>0)
        {
            r=m%10;
            m/=10;
            f=1;
            for(r=r;r>=1;r--)
            {
                f*=r;
            }
            s+=f;
        }
        if(n==s)
        {
            System.out.printf("The number "+n+" is a strong number");
        }
        else
        {
            System.out.printf("The number "+n+" is not a strong number");
        }
    }
}