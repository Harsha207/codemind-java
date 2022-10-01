import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],b[];
        n=sc.nextInt();
        a=new int[n];
        b=new int[n];
        for(int i=0;i<n;i++)
          a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
           b[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+b[i]+" ");
        }
    }
}