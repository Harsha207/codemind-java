import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k,c=0;
        int x[],i;
        n=sc.nextInt();
        k=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
           x[i]=sc.nextInt();
        for(int ele:x)
        {
            if(ele%k!=0)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}