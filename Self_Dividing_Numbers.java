import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y,c,r,co,n;
        x=sc.nextInt();
        y=sc.nextInt();
        for(x=x;x<=y;x++)
        {
            n=x;
            c=0;
            co=0;
            while(n>0)
            {
                r=n%10;
                n/=10;
                co+=1;
                if(r==0)
                break;
                if(x%r==0)
                c+=1;
            }
            if(c==co)
            {
                System.out.print(x+" ");
            }
        }
    }
}