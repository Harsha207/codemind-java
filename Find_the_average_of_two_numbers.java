import java.util.Scanner;
class average
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m;
        float average;
        n=sc.nextInt();
        m=sc.nextInt();
        average=(float)(n+m)/2;
        System.out.format("%.4f",average);
    }
}