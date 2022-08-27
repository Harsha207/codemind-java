import java.util.Scanner;
class modulus
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,modulus;
        a=sc.nextInt();
        b=sc.nextInt();
        modulus=a%b;
        System.out.println(modulus);
    }
}