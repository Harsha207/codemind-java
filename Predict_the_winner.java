import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[],e=0,o=0;
        x=new int[n];
        for(int i=0;i<n;i++)
          x[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                e+=x[i];
            }
            else
            {
                o+=x[i];
            }
        }
        int d=Math.abs(e-o);
        if(d%4==0)
        {
            System.out.println("X");
        }
        else
        {
            System.out.println("Y");
        }
    }
}