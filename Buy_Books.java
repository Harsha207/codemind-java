import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],y[],i,s1=0,s2=0;
        n=sc.nextInt();
        x=new int[n];
        y=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            s1+=x[i];
        }
        for(i=0;i<n;i++)
        {
            y[i]=sc.nextInt();
            s2+=y[i];
        }
        if(s2-s1<0)
        {
            System.out.println("0");
        }
        else
        {
            System.out.println(s2-s1);
        }
    }
}