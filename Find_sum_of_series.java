import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float n,i,s=0;
        n=sc.nextFloat();
        for(i=1;i<=n;i++)
        {
            s+=1/i;
        }
        System.out.format("%.2f",s);
    }
}