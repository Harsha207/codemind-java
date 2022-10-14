import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int u=0,d=0,l=0,r=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='U')
            {
                u+=1;
            }
            else if(s.charAt(i)=='D')
            {
                d+=1;
            }
            else if(s.charAt(i)=='L')
            {
                l+=1;
            }
            else
            {
                r+=1;
            }
        }
        if(u==d && l==r)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}