import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,x[][],i,j,s=0;
        m=sc.nextInt();
        n=sc.nextInt();
        x=new int[m][n];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                x[i][j]=sc.nextInt();
                s+=x[i][j];
            }
        }
        System.out.println(s);
    }
}