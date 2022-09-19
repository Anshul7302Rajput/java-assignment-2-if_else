/*Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
if employee is female, then she will work only in urban areas.

if employee is a male and age is in between 20 to 40 then he may work in anywhere

if employee is male and age is in between 40 t0 60 then he will work in urban areas only.

And any other input of age should print "ERROR".*/

import java.util.Scanner;
public class ques13{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        System.out.println("Enter your marital status: ");
        char m=sc.next().charAt(0);
        System.out.println("Enter your sex:");
        char s=sc.next().charAt(0);


        if(s=='f'||s=='F'){
            System.out.println("Employee is female and she will work only in urban areas!");
        }
        else if((s=='m'||s=='M') && (age<=40 &&age>=20)){
            System.out.println("he may work anywhere!");
        }
        else if((s=='m'||s=='M') && (age<=60 &&age>=40)){
            System.out.println("he will work in urban areas!");
        }
        else{
            System.out.println("ERROR");
        }

    }
}