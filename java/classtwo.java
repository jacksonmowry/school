import java.util.Scanner;
class classtwo {
    public static void main(String[] args) {
        String input;
        int age;
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name? ");
        input = scan.next(); // Grabs everything until whitespace (enter, space, or tab)

        System.out.println("How old are you? ");
        age = scan.nextInt();

        System.out.println("Your name is: " + input);
        System.out.println("You are this old: " + age);

        age = age + 10;
        System.out.println("Your age in 10 years will be: " + age);

        scan.close();
    }
}
