import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,sq,s=0;
        n=sc.nextInt();
        sq=n*n;
        while(sq!=0)
        {
            r=sq%10;
            s=s+r;
            sq=sq/10;
        }
        if(s==n)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not Neon Number");
        }
    }
}