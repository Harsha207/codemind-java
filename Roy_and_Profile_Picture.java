import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int L,N,W,H,i;
        L=sc.nextInt();
        N=sc.nextInt();
        for(i=0;i<N;i++)
        {
            W=sc.nextInt();
            H=sc.nextInt();
            if(W<L || H<L)
            {
                System.out.println("UPLOAD ANOTHER");
            }
            else
            {
                if(W==H)
                {
                    System.out.println("ACCEPTED");
                }
                else
                {
                    System.out.println("CROP IT");
                }
            }
        }
    }
}