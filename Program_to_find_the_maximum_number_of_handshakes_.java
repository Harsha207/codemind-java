import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,h;
        n=sc.nextInt();
        h=((n-1)*n)/2;
        System.out.println(h);
    }
}