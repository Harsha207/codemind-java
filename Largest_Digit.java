import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,ld=0;
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            if(ld<r)
            {
                ld=r;
            }
            n=n/10;
        }
        System.out.println(ld);
    }
}