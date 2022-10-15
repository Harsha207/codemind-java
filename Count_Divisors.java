import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l,r,k,c=0;
        l=sc.nextInt();
        r=sc.nextInt();
        k=sc.nextInt();
        for(l=l;l<=r;l++)
        {
            if(l%k==0)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}