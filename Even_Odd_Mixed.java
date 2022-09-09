import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,e=0,o=0,c=0,r;
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            n=n/10;
            c++;
            if(r%2==0)
            {
                e++;
            }
            else
            {
                o++;
            }
        }
        if(c==e)
        {
            System.out.println("Even");
        }
        else if(c==o)
        {
            System.out.println("Odd");
        }
        else
        {
            System.out.println("Mixed");
        }
    }
}