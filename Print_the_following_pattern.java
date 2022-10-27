import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==j||i==n+1-j)
                {
                    System.out.printf("%d ",n-i+1);
                }
                else
                {
                    System.out.printf(" ");
                }
            }
            System.out.printf("
");
        }
    }
}