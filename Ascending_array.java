import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[],c=0;
        x=new int[n];
        for(int i=0;i<n;i++)
         x[i]=sc.nextInt();
        for(int i=0;i<n-1;i++)
        {
            if(x[i]>=x[i+1])
            {
                c+=1;
                break;
            }
        }
        if(c==0)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}