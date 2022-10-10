import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a,b,c=0;
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            c=0;
            while(a<=b)
            {
                if(a%10==2 || a%10==3 || a%10==9)
                {
                    c+=1;
                }
                a++;
            }
            System.out.println(c);
        }
    }
}