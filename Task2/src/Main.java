import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       refactured(new Scanner(System.in).nextLine());
    }
    public static boolean isFormat(String input){
        if((input.indexOf(' ') == input.lastIndexOf(" ")) ||
                (input.substring(input.indexOf(' ')+1,
                        input.lastIndexOf(" ")).indexOf(' ') != -1)) return false;
        else return true;
        }
    public static void refactured(String input) {
        if (isFormat(input)) {
            String firstName = input.substring(0, input.indexOf(' '));
            String secondName = input.substring(input.indexOf(' ') + 1, input.lastIndexOf(" "));
            String thirdName = input.substring(input.lastIndexOf(" ") + 1, input.length());
            System.out.println("Фамилия: " + firstName + "\n"
                    + "Имя: " + secondName + "\n"
                    + "Отчество: " + thirdName + "\n");
        }
        else System.out.println("incorrect format");
    }
}