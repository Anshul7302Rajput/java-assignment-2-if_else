/*A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount.*/


import java.util.*;
public class ques4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your service year:");
        int ser=sc.nextInt();
        System.out.println("Enter your salary:");
        int sal=sc.nextInt();
        if(ser>=5){
            sal+=sal*0.5;
        }
        System.out.println("total salary of the employee is: "+sal);
    }
}