import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[];
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int r,y,s=0;
            y=x[i];
            while(y>0)
            {
                r=y%10;
                s=(s*10)+r;
                y/=10;
            }
            if(s==x[i])
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}