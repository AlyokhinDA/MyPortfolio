import java.util.Scanner;
import static java.lang.System.*;
public class Main {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(in);

            out.print("Type an Expression: ");
            int x = sc.nextInt();
            char ch = sc.next().charAt(0);
            int y = sc.nextInt();
            int result = 0;
            sc.close();

            switch(ch) {
                case '+':
                    result = x + y;
                    break;
                case '-':
                    result = x - y;
                    break;
                case '*':
                    result = x * y;
                    break;
                case '/':
                    result = x / y;
                    break;
                default: out.println("wrong operation");
                return;
            }

            if (x > 10) {
                throw new Exception("x may not more than 10");
            }

            if (y > 10) {
                throw new Exception("y may not more than 10");
            }
        }
        catch(ArithmeticException ex){
            out.println("Do not divide by zero!!!!!!!");
        }
        catch(Exception ex){
            out.println(ex.getMessage());
        }
    }
}