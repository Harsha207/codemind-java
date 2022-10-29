import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=2,c=0,d=0;
        while(x<n)
        {
            if(n%x==0)
            {
                c+=1;
            }
            x+=1;
        }
        if(c!=0)
        {
            System.out.println("Not Mega Prime");
        }
        else
        {
            while(n>0)
            {
                if(n%10==2 || n%10==3 || n%10==5 || n%10==7)
                {
                    c+=1;
                }
                d+=1;
                n/=10;
            }
            if(c==d)
            {
                System.out.println("Mega Prime");
            }
            else
            {
                System.out.println("Not Mega Prime");
            }
        }
    }
}