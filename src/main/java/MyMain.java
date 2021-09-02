import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scan.next();
        System.out.println("Hi " + name + ".");

        System.out.print("What is your favorite car company? ");
        String car_company = scan.next();
        System.out.println("I like " + car_company + " too!!");

        System.out.print("What city do you live in? ");
        String place = scan.next();
        System.out.println("I love it in " + place + "!!");

        System.out.print("What is your favorite subject? ");
        String subject = scan.next();
        System.out.println("I absolutely love learning about " + subject + " too!!");

        System.out.print("What is your favorite sport? ");
        String sport = scan.next();
        System.out.println("I used to play " + sport + " when I was younger.");


        // Add some code here!

        scan.close();
    }
}
