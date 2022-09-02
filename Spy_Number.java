import java.util.Scanner;
class Solution
{
    public static int product(int n)
    {
        int p=1,r;
        while(n>0)
        {
            r=n%10;
            p=p*r;
            n=n/10;
        }
        return p;
    }
    public static int sum(int n)
    {
        int s=0,r;
        while(n>0)
        {
            r=n%10;
            s=s+r;
            n=n/10;
        }
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r1,r2;
        n=sc.nextInt();
        r1=product(n);
        r2=sum(n);
        if(r1==r2)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not Spy Number");
        }
    }
}