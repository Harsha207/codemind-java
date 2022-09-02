import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n;
        m=sc.nextInt();
        n=sc.nextInt();
        if(m%2==0 && (m>0 || n%2==0))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}