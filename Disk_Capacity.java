import java.util.Scanner;
class capacity
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,s,b,capacity;
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        capacity=2*t*s*b*512;
        System.out.println(capacity);
    }
}