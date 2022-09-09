import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,s=0;
        n=sc.nextInt();
        int i=1;
        while(i<n)
        {
            if(n%i==0)
            s=s+i;
            i++;
        }
        if(n==s)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}