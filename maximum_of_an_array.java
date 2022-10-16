import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],l;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        l=x[0];
        for(int i=0;i<n;i++)
        {
            if(l<x[i])
            {
                l=x[i];
            }
        }
        System.out.println(l);
    }
}