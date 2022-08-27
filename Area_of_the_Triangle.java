import java.util.Scanner;
class area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        float S,area;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        S=(float)(a+b+c)/2;
        area=(float)Math.sqrt(S*(S-a)*(S-b)*(S-c));
        System.out.format("%.2f",area);
    }
}