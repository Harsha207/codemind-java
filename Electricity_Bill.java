import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String custID,name;
        int units;
        custID=sc.nextLine();
        name=sc.nextLine();
        units=sc.nextInt();
        double bill;
        if(units<200)
        {
            bill=units*1.20;
        }
        else if(units>=200 && units<400)
        {
            bill=units*1.50;
        }
        else if(units>=400 && units<600)
        {
            bill=units*1.80;
        }
        else
        {
            bill=units*2.00;
        }
        if(bill>400)
        {
            bill=bill+0.15*bill;
        }
        else
        {
            bill=bill+100;
        }
        System.out.format("%.2f",bill);
    }
}