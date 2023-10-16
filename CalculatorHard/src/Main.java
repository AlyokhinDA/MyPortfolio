import java.util.Scanner;
import static java.lang.System.*;
public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(in);

            out.print(" __" + "|Type an Expression:\n" + "|\n" + " ==> ");
            int a = sc.nextInt();
            char op = sc.next().charAt(0);
            int b = sc.nextInt();

            Calc(a, op, b);

            if (a > 1000) {
                throw new Exception("Variable <'a'> can't be more than 1000!!!");
            }
            if (b > 1000) {
                throw new Exception("Variable <'b'> can't be more than 1000!!!");
            }

        } catch (java.lang.ArithmeticException ex) {
            out.println("You can't divide by zero!!!");
        } catch (Exception ex) {
            out.println(ex.getMessage());
        }
    }
    public static void Calc(int a, char op, int b) {
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
                out.print("Type the right operation!!!\n" + "-> : (<+> <-> <*> </>) : <-");
                return;
        }
        if (a <= 1000 && b <= 1000) {
            out.println(result);
        }
    }
}