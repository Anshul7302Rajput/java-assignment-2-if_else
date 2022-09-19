/*A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.*/

import java.util.Scanner;
public class ques8 {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number of class held : ");
   int a1=sc.nextInt();
   System.out.println("Enter the number of class attend : ");
   int a2=sc.nextInt();
   double a3=100*a2/a1;
   System.out.println("percentage of attendence is:"+a3); 
if(a3>=75.0){
    System.out.println("yes he is allowed");
}
else{
    System.out.println("he is not allowed");
}
}
}