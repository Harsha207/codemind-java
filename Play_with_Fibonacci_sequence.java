import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=0,n2=1,n3,i;
        System.out.format("%d %d ",n1,n2);
        for(i=1;i<n-1;i++)
        {
            n3=n1+n2;
            System.out.format("%d ",n3);
            n1=n2;
            n2=n3;
        }
    }
}