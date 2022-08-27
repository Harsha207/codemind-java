import java.util.Scanner;
class multiply
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a,b,multiply;
        a=sc.nextFloat();
        b=sc.nextFloat();
        multiply=a*b;
        System.out.format("%.2f",multiply);
    }
}