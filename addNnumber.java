
import java.util.Scanner;

public class addNnumber {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int a=sr.nextInt();
        int sum=0;
        for(int i=0;i<=a;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
