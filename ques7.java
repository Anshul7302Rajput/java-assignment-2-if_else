/*Write a program to print absolute vlaue of a number entered by user. E.g.-
INPUT: 1        OUTPUT: 1
INPUT: -1        OUTPUT: 1*/

import java.util.Scanner;
public class ques7 {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number: ");
   int n=sc.nextInt();
   System.out.println(Math.abs(n)); 
}
}
