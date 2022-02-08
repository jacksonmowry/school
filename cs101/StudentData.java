//
// Jackson Mowry
// Thur Feb 3 2022
// This is a program to collect student data and organize it into a database format
//
import java.util.Scanner;
class StudentData {
    public static void main(String[] args) {
        // Recieve input from user here
        // Ask for: first, last, student ID, high school,
        // last letter grade in CS, and GPA
        String firstName;
        String lastName;
        String studentID; // Some student ID numbers may start with 0's and we need those preserved
        String highSchool;
        char lastGrade = 'c'; // Does not use plus or minus
        int age;
        double GPA;

        // Setting up our scanner object to use the new line character
        // as its delimiter instead of the space character
        Scanner inputScanner = new Scanner(System.in);
        inputScanner.useDelimiter("\\n");

        // Prompt the user for their data
        System.out.print("Welcome to the student database!\n What is your first name?: ");
        firstName = inputScanner.next();
        System.out.print(" What is your last name?: ");
        lastName = inputScanner.next();
        System.out.print(" What is your student ID?: ");
        studentID = inputScanner.next();
        System.out.print(" What high school did you attend?: ");
        highSchool = inputScanner.next();
        System.out.print(" What was your last letter grade awarded in a CS class?: ");
        lastGrade = inputScanner.next().charAt(0);
        System.out.print(" What is your age?: ");
        age = inputScanner.nextInt();
        System.out.print(" Lastly, what is your current GPA?: ");
        GPA = inputScanner.nextDouble();
        inputScanner.close();

        // Lastly we will output all of the user input to confirm that is is correct
        System.out.println(firstName + "\n" + lastName + "\n" + studentID + "\n" + highSchool + "\n" + lastGrade + "\n" + age + "\n" + GPA);
    }
}
