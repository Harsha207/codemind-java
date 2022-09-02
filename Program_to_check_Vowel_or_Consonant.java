import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char c;
        c=sc.nextLine().charAt(0);
        if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='O'||c=='o'||c=='U'||c=='u')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}