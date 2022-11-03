import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[],s=0,c=0;
        x=new int[n];
        int k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            s=0;
            for(int j=i;j<n;j++)
            {
                s+=x[j];
                if(s==k)
                {
                    c+=1;
                }
            }
        }
        System.out.println(c);
    }
}