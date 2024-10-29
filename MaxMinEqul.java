
import java.util.Scanner;

public class MaxMinEqul {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.out.println(a + " is gratter then " + b);
        }
        else{
            if (a<b) {
                System.out.println(b + " gratter then " + a); 
            }
            else{
                System.out.println(a+" and " + b +" is equal");
            }
        }
        
    }
}
