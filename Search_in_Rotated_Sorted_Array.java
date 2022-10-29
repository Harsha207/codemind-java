import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[];
        x=new int[n];
        int f=0;
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(x[i]==t)
            {
                System.out.println(i);
                f=1;
            }
        }
        if(f==0)
        {
            System.out.println("-1");
        }
    }
}