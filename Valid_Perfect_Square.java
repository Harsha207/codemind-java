import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[];
        int p=0,i,j;
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=1;j<=x[i]/2;j++)
            {
                p=j*j;
                
                if(p==x[i])
                {
                    System.out.println("True");
                    break;
                }
            }
            if(x[i]!=p)
            {
                System.out.println("False");
            }
        }
    }
}