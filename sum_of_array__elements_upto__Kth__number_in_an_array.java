import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],s=0,k;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
           x[i]=sc.nextInt();
        k=sc.nextInt();
        for(int i=0;i<k;i++)
        {
            s+=x[i];
        }
        System.out.println(s);
    }
}