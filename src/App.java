import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        for(int i=1; i<=10; i++) {
            System.out.println(num+" x "+i+" = "+num*i);
        }
        sc.close();
    }
}