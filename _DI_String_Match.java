import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int j=s.length();
        int k=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='I')
            {
                System.out.print(k+" ");
                k+=1;
            }
            else 
            {
                System.out.print(j+" ");
                j-=1;
            }
        }
        System.out.println(k);
    }
}