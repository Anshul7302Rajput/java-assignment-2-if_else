/*Take input of age of 3 people by user and determine oldest and youngest among them.*/

import java.util.Scanner;
public class ques6 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the age of 1st person:");
    int a=sc.nextInt();
    System.out.println("Enter the age of 2nd person:");
    int b=sc.nextInt();

    System.out.println("Enter the age of 3rd person:");
    int c=sc.nextInt();
    if((a>b) &&(a>c)){
        System.out.println("oldest man is a ");
    }
    else if((b>c) &&(b>a)){
        System.out.println("oldest man is b ");
    }
    else if((c>a) &&(c>b)){
        System.out.println("oldest man is c ");
    }

   } 
}