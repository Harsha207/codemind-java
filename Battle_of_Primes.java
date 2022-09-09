import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2,c,p,s;
        n1=sc.nextInt();
        n2=sc.nextInt();
        s=n1+n2;
        p=s;
        for(int i=1;i<=10;i++)
        {
            p+=1;
            c=0;
            for(int j=1;j<=p;j++)
            {
                if(p%j==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                System.out.println(p-s);
                break;
            }
        }
    }
}