/*A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.*/

import java.util.*;
public class ques3 {

    public static void main(String[] args) {
        System.out.println("enter the two number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        if(a>b){
            System.out.println("a is greater than b");
        }
        else
        System.out.println("b is greater than a");
    }
}