import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],s=0,c=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
         x[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            s+=x[i];
        }
        int a=s/n;
        for(int i=0;i<n;i++)
        {
            if(x[i]>=a)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}