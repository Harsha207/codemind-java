import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c;
        c=a+b;
        int temp=n;
        while(c<temp)
        {
            c=a+b;
            a=b;
            b=c;
        }
        if(n-a>b-n)
        {
            System.out.print(b);
        }
        else if(n-a<b-n)
        {
            System.out.print(a);
        }
        else
        {
            System.out.printf("%d %d",a,b);
        }
    }
}