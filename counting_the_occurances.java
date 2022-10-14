import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch=sc.nextLine().charAt(0);
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ch)
            {
                c+=1;
            }
        }
        if(c==0)
        {
            System.out.println("-1");
        }
        else
        {
            System.out.println(c);
        }
    }
}