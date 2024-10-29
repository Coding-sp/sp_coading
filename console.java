import java.util.Scanner;

public class console {
    public static void main(String[] args) {
        System.out.println("enter a name");
        String a=System.console().readLine();
        System.out.println("your name is  "+a);
        /*same program using scaner */
        System.out.println("enter a name");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("your name is "+s);
        /*same name enter one time */
        System.out.println("YOUR NAME IS "+a);     
    }
    
}
