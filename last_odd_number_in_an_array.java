import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[];
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=n-1;i>=1;i--)
        {
            if(x[i]%2!=0)
            {
                System.out.println(x[i]);
                break;
            }
        }
    }
}