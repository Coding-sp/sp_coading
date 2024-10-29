
import java.util.Scanner;

public class javaAllPattern {
    public static void main(String[] args) {
        System.out.println("enter the number=");
       Scanner sc =new Scanner(System.in);
       int a=sc.nextInt();
       //ractangle
       for (int i = 0; i <=a; i++) {
        for(int j=1;j<=5;j++){
            System.out.print("* ");
        }
        System.out.println();     
       }
       //holo ractangle
       int b=sc.nextInt();
       for(int i=1;i<=a;i++){
        for(int j=1;j<=b;j++){
            if(i==1||j==1||i==a||j==b){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            
        }
        System.out.println();
       }
       //half trangle
       for(int i=1;i<=a;i++){
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
       }
       //inverse trangle
       for(int i=1;i<=a;i++){
        for(int j=1;j<=a-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
       }
       //ractangal in degit
       for(int i=1;i<=a;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
       }
       //revase half trangle in degit
       for(int i=a;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
       }
       //revase half trangle
       for(int i=a;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
       }
       //half trangle in continue number
       int num=1;
       for (int i = 0; i<=a; i++) {
           for (int j=1;j<=i;j++){
            System.out.print(num +" ");
            num++;
           }
           System.out.println();
       }
       //full trangle
       for(int i=1;i<=a;i++){
        for(int j=1;j<=a-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
       }
       //butterfly style
       for(int i=1;i<=a;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        for(int j=1;j<=2*(a-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
       }
       for(int i=a;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        for(int j=1;j<=2*(a-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
       }
       //ranbos
       for(int i=1;i<=a;i++){
        for(int j=1;j<=a-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=a;j++){
            System.out.print("* ");
        }
        System.out.println();
       }
       // number pyramid
       for(int i=1;i<=a;i++){
        for(int j=1;j<=a-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println();
       }
       //palindram pattarn
       for(int i=1;i<=a;i++){
        for(int j=1;j<=a-i;j++){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
        for(int j=2;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
       }
       //dimond pattern
       for(int i=1;i<=a;i++){
        for(int j=1;j<=a-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=(2*i)-1;j++){
            System.out.print("*");
        }
        System.out.println();
       }
       for(int i=a;i>=1;i--){
        for(int j=1;j<=a-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=(2*i)-1;j++){
            System.out.print("*");
        }
        System.out.println();
       }
       //o-1 half trangle
       for(int i=1;i<=a;i++){
        for(int j=1;j<=i;j++){
            if((i+j)%2==0){
                System.out.print("1");
            }else{System.out.print("0");}
        }
        System.out.println();
       }
    }
}
