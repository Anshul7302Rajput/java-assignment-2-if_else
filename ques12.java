/*Write a program to check if a year is leap year or not.
If a year is divisible by 4 then it is leap year but if the year is century year like 2000, 1900, 2100 then it must be divisible by 400.
   */ 


  import java.util.Scanner;
  public class ques12 {
      public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the year to check :");
          int n=sc.nextInt();
          if(((n%400==0)||(n%100!=0))&&(n%4==0)){
              System.out.println("Entered year is leap year:");
          }
          
          else{
              System.out.println("Entered year is not leap year:");
          }
      }
  }