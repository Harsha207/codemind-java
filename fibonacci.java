import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[];
        x=new int[n];
        x[0]=0;
        x[1]=1;
        for(int i=2;i<n;i++)
        {
            x[i]=x[i-1]+x[i-2];
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(x[i]+" ");
        }
    }
}