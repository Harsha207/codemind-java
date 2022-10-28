import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,d,temp,s=0;
        temp=n;
        d=(int)Math.log10(n)+1;
        while(n>0)
        {
            r=n%10;
            s+=Math.pow(r,d);
            n/=10;
            d--;
        }
        if(s==temp)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}