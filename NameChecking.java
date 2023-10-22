import java.util.Scanner;
public class NameChecking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) System.out.println("Введите корректное имя!");
        }
    }

    private static boolean checkName(String name) {
        boolean check = false;
        if (name.trim().split(" ").length != 3) {
            check = false;
        } else check = true;

        System.out.println(formatName(name));

        return check;
    }

    private static String formatName(String name) {
        String[] fullName = name.trim().split(" ");
        sortByLength(fullName);
        String s1 = name, s2 = "";

        s2 = s2 + s1.substring(0, 1).toUpperCase();
        for (int i = 1; i < s1.length(); i++) {
            // смотрим, был ли слева пробел:
            if (" ".equals(s1.substring(i - 1, i)))
                s2 = s2 + s1.substring(i, i + 1).toUpperCase();
            else
                s2 = s2 + s1.substring(i, i + 1);
        }
        return s2;
    }

    private static void sortByLength(String[] words) {
    }
}
