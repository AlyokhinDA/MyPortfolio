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
       if (name.trim().split(",").length != 3) {
           check = false;
       } else check = true;

       formatName(name);
       String[] words = new String[name.trim().split(",")];
       sortByLength(words);

       return check;
   }

   private static String formatName(String name) {
       String str;
       Scanner s = new Scanner(name);
       str = s.charAt(0).toUpperCase();
       str = s.charAt(0).toUpperCase();
       str = s.charAt(0).toUpperCase();

       return name;
   }

   private static void sortByLength(String[] words) {
       if (words[0] < words[1]) {
           words[0] = words[1];
           words[1] = words[0];

           if (words[1] < words[2]) {
               words[1] = words[2];
               words[2] = words[1];
           } else {
               words[2] = words[0];
               words[0] = words[2];
           }
       }
   }
}
