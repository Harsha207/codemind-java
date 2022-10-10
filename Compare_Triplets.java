import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],y[],a=0,b=0,i;
        x=new int[3];
        y=new int[3];
        for(i=0;i<3;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<3;i++)
        {
            y[i]=sc.nextInt();
        }
        for(i=0;i<3;i++)
        {
            if(x[i]>y[i])
            {
                a+=1;
            }
            else if(x[i]<y[i])
            {
                b+=1;
            }
        }
        System.out.format("%d %d",a,b);
    }
}