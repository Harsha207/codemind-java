import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c;
        float f;
        c=sc.nextInt();
        f=(float)(32+(c*1.8));
        System.out.format("%.2f",f);
    }
}