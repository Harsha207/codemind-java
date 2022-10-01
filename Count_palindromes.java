import java.util.Scanner;
class Solution
{
    public static boolean palindrome(int n)
    {
        int r1,r2,f=0;
        int d=(int)Math.log10(n);
        while(n>0)
        {
            r1=n%10;
            r2=n/(int)Math.pow(10,d);
            if(r1!=r2)
            {
                f=1;
                break;
            }
            n=n%(int)Math.pow(10,d);
            n/=10;
            d-=2;
        }
        if(f==0)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0;
        n=sc.nextInt();
        int []x=new int[n];
        for(int i=0;i<n;i++)
           x[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(palindrome(x[i]))
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}