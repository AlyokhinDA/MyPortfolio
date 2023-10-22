import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class NameChecking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your name:\n" + "==> ");
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) {
                System.out.println("Введите корректное имя!");
            } else {
                System.out.println(formatName(name));
            }
        }
    }

    private static boolean checkName(String name) {
        boolean check = false;
        if (name.trim().split(" ").length != 3) {
            check = false;
        } else check = true;

        return check;
    }

    private static String formatName(String name) {
        String[] fullName = name.trim().split(" ");
        String s = "";

        sortByLength(fullName);

        for (int i = 0; i < fullName.length; i++) {
            fullName[i] = fullName[i].substring(0, 1).toUpperCase() + fullName[i].substring(1);
            s = fullName[0] + " " + fullName[1] + " " + fullName[2];
        }
        return s;
    }

    private static void sortByLength(String[] words) {
        boolean isSorted = false;
        String s = "";
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < words.length - 1; i++) {
                if (words[i].length() > words[i + 1].length()) {
                    isSorted = false;

                    s = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = s;
                }
            }
        }
    }
}
