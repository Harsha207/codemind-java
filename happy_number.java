import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int j,s=0;
        while(s!=1 && s!=4)
        {
            s=0;
            while(n>0)
            {
                j=n%10;
                s+=j*j;
                n/=10;
            }
            n=s;
        }
        if(s==1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}