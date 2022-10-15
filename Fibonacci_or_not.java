import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,count=0;
        n=sc.nextInt();
        int a=0,b=1,c;
        c=a+b;
        while(c<=n)
        {
            if(c==n)
            {
                count=1;
                break;
            }
            a=b;
            b=c;
            c=a+b;
        }
        if(count==1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}