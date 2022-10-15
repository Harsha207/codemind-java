import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n,c=0;
        n=sc.nextLong();
        while(n>0)
        {
            n/=10;
            c+=1;
        }
        if(c==10)
        {
            System.out.println("Valid");
        }
        else if(n/1000000000!=0)
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}