/*Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).*/

import java.util.Scanner;
public class ques11 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the character you want to check :");
         char ch=sc.next().charAt(0);
         if(ch>='a'&&ch<='z'){
            System.out.println("Enter character is lowercase:");
         }
         else if(ch>='A'&&ch<='Z'){
            System.out.println("Entered character is uppercase: ");
         }
         else{
            System.out.println("Invalid character");
         }
        }
    }
