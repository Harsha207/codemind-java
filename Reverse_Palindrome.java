import java.util.Scanner;
class Solution
{
    public static int reverse(int x)
    {
        int r,rev=0;
        while(x>0)
        {
            r=x%10;
            rev=rev*10+r;
            x/=10;
        }
        return rev;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        do
        {
            x+=reverse(x);
        }while(x!=reverse(x));
        System.out.println(x);
    }
}