import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,f=0,temp;
        n=sc.nextInt();
        temp=n;
        while(temp<1 || temp>1)
        {
            if(temp%2==0)
            {
                temp=temp/3;
            }
            else if(temp%3==0)
            {
                temp=temp/3;
            }
            else if(temp%5==0)
            {
                temp=temp/5;
            }
            else
            {
                f=1;
                break;
            }
        }
        if(f==0)
        {
            System.out.println("Ugly Number");
        }
        else
        {
            System.out.println("Not Ugly Number");
        }
    }
}