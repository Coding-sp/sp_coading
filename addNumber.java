import java.util.Scanner;

public class addNumber {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("enter 2ndnumber");
        int num2=sc.nextInt();
        int sum=num+num2;
        System.out.println("the sum is=  "+sum);        
    }
}
