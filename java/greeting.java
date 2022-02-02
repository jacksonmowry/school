// This program will ask a user to input their name.
// Then the program will return a kind greeting message personalized to their respone.
// Jackson Mowry
// <2022-02-01>
import java.util.Scanner;
class greeting {
   public static void main(String[] args) {
      String first;
      String last;
      Scanner s = new Scanner(System.in);
      System.out.print("What is your first name? ");
      first = s.next();
      System.out.print("What is your last name? ");
      last = s.next();
      System.out.println("Hi " + first + "! I hope the " + last + " family \n is well!");
      s.close();
   }
}
