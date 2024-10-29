
import java.util.Scanner;

public class CalculaterWithSwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1st number");
        int a=sc.nextInt();
        System.out.println("enter the 2nd number");
        int b=sc.nextInt();
        int sum=a+b;
        int mul=a*b;
        float div=a/b;
        int sub=a-b;
        float mod=a%b;
        System.out.println("enter the operation numbet add=1  mul=2  div=3  sub=4 mod=5");
        int button=sc.nextInt();

        switch (button) {
            case 1:System.out.println("addition= "+sum);
            break;
            case 2:System.out.println("multi= "+mul);
            break;
            case 3:System.out.println("devision= "+div);
            break;
            case 4:System.out.println("sub= "+sub);
            break;
            case 5:System.out.println("mod= "+mod);
            break;
            default:System.out.println("invalid input");
        }
    }
}
