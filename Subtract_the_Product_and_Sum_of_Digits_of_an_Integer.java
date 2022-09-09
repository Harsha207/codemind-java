import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,s=0,p=1;
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            s=s+r;
            p=p*r;
            n=n/10;
        }
        System.out.println(p-s);
    }
}