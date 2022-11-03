import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int x=sc.nextInt();
        if(n1>n2)
        {
            System.out.println("-1");
        }
        else
        {
            int c=1;
            while(x+n1>=n2)
            {
                c+=1;
                n1+=n1;
                n2+=n2;
            }
            System.out.println(c);
        }
    }
}