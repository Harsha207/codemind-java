import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],s;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        s=x[0];
        for(int i=0;i<n;i++)
        {
            if(x[i]<s)
            {
                s=x[i];
            }
        }
        System.out.println(s);
    }
}