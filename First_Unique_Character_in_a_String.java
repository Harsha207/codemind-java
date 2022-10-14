import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int f=0;
        for(int i=0;i<s.length();i++)
        {
            int c=0;
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    c+=1;
                }
            }
            if(c==1)
            {
                System.out.println(i);
                f=1;
                break;
            }
        }
        if(f==0)
        {
            System.out.println("-1");
        }
    }
}