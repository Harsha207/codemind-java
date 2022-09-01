import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,c=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
           x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]%2!=0)
            {
                c++;
            }
        }
        if(c<=2)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}