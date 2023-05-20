import java.util.Scanner;

public class questions {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc. nextInt();
        System.out.println("Enter Operator");
        char op = sc.next().charAt(0);
        int r=0;
        switch(op){
            case'+':
            r =a+b;
            System.out.println(a+"+"+b+"="+r);
            break;
            case '-':
            r =a-b;
            System.out.println(a+"-"+b+"="+r);
            break;
            case'*':
            r= a*b;
            System.out.println(a+"*"+b+"="+r);
            break;
            case '/':
            r=a/b;
            System.out.println(a+"/"+b+"="+r);
            break;
            default:
            System.out.println("Invalid input");
        }
    }
}