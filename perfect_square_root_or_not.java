import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=0;
        for(int i=0;i<n;i++)
        {
            if(n==i*i)
            {
                System.out.println("True");
                f=1;
            }
        }
        if(f==0)
        {
            System.out.println("False");
        }
    }
}