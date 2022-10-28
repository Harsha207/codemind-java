import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float p=sc.nextFloat();
        float r=sc.nextFloat();
        float t=sc.nextFloat();
        double ci=p*(Math.pow((1+r/100.00),t));
        System.out.format("%.2f",ci);
        
    }
}