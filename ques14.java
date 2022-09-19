/*A 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one. E.g.-
INPUT : 1234        OUTPUT : 4321
INPUT : 5982        OUTPUT : 2895 */


import java.util.Scanner;
public class ques14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number! ");
        int n=sc.nextInt();
       
     int res=0;
int rev;
while(n!=0){
    rev=n%10;
    res=res*10;
    res+=rev;

    n=n/10;
}
System.out.println(res);
}
}