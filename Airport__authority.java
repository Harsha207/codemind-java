import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],b=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
          x[i]=sc.nextInt();
        int t=sc.nextInt();
        for(int ele :x)
        {
            if(ele<=t)
            {
                b=b+1;
            }
            else
            {
                b=b+2;
            }
        }
        System.out.println(b);
    }
}