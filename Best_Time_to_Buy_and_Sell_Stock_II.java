import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[];
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
         x[i]=sc.nextInt();
        int s=0;
        for(int i=1;i<n;i++)
        {
            if(0<x[i]-x[i-1])
            {
                s+=x[i]-x[i-1];
            }
        }
        System.out.println(s);
    }
}