
import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int button=sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:System.out.println("world");
            break;
            case 3:System.out.println("Go to hell");
            break;
            default:
                System.out.println("enter invelid input");
        }
    }
}
