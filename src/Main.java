import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to get a day of the week: ");
        int day = scanner.nextInt();

        switch (day){
            case 1 -> System.out.println("This is Sunday");
            case 2 -> System.out.println("This is Monday");
            case 3 -> System.out.println("This is Tuesday");
            case 4 -> System.out.println("This is Wednesday");
            case 5 -> System.out.println("This is Thursday");
            case 6, 7 -> System.out.println("This is weekend");  //  אפשר לאחד תנאים אם נרצה לבצע את אותה הפעולה ב caseים מסויימים
            default -> System.out.println("No such day!");
        }
        
    }
}