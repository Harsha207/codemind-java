import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,c=0,x[];
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(x[i]==x[j])
                {
                    x[j]=1;
                }
            }
            if(x[i]%2==0 && x[i]!=1)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}