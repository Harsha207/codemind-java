import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],z,c=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
          x[i]=sc.nextInt();
        z=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(x[i]==z)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}