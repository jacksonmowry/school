import java.util.Scanner;
class test {
    public static void main(String[] args) {
        int x;
        int y;
        int result;
        String op;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter <left> <op> <right>: ");
        if (!scan.hasNextInt()) {
            System.out.println("ERROR <left>: You need to specify an integer.");
            scan.close();
            return;
        }
        x = scan.nextInt();
        if (!scan.hasNext()) {
            System.out.println("ERROR <op>: You need to specify and operator.");
            scan.close();
            return;
        }
        op = scan.next();
        if (!scan.hasNextInt()) {
            System.out.println("ERROR <right>: You need to specify an integer.");
            scan.close();
            return;
        }
        y = scan.nextInt();
        switch (op) {
            case "+": result = x + y; break;
            case "-": result = x - y; break;
            case "*": result = x * y; break;
            case "/": result = x / y; break;
            case "%": result = x % y; break;
            default:
                System.out.println("Invalid operator '" + op + "'");
                scan.close();
                return;
        }

        String output = String.format("%d %s %d = %d", x, op, y, result);
        System.out.println(output);
        scan.close();
    }
}
