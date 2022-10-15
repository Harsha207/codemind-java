import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=0,s,sq,t=0;
        s=n*n;
        while(n>0)
        {
            r=r*10+n%10;
            n/=10;
        }
        sq=r*r;
        while(sq>0)
        {
            t=t*10+sq%10;
            sq/=10;
        }
        if(t==s)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}