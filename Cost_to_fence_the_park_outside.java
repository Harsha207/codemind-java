import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l,b,w,c,a,t;
        l=sc.nextInt();
        b=sc.nextInt();
        w=sc.nextInt();
        c=sc.nextInt();
        a=((l+2*w)*(b+2*w))-l*b;
        t=a*c;
        System.out.println(t);
    }
}