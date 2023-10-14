import java.util.Scanner;
import static java.lang.System.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int a = sc.nextInt();
        char op = sc.next().charAt(0);
        int b = sc.nextInt();
        int result;

        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Введите верную операцию!");
                return;
        }
    }
}
