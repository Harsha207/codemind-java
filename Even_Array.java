import java.util.Scanner;
class SOlution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],c=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
          x[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(x[i]%2==0)
            {
                c+=1;
            }
        }
        if(c==n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}