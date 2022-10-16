import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,j,gcd;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        gcd=x[0];
        j=1;
        while(j<n)
        {
            if(x[j]%gcd==0)
            {
                j+=1;
            }
            else
            {
                gcd=x[j]%gcd;
                i+=1;
            }
        }
        System.out.println(gcd);
    }
}