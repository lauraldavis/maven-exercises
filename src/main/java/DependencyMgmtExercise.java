import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;
import static org.apache.commons.lang3.StringUtils.reverse;
import static org.apache.commons.lang3.StringUtils.swapCase;

public class DependencyMgmtExercise {

    public static void main(String[] args) {
        // prompt user for input and
        // tell whether input is a number
        // flips the case of the string
        // reverses the string

        Scanner sc = new Scanner(System.in); // .useDelimiter("\n");

        String strPrompt = "Enter a string (one or more words): ";
        System.out.println(strPrompt);
        String userInput = sc.nextLine();
        System.out.println("You Entered: \"" + userInput + "\"");

        String isNum = (StringUtils.isNumeric(userInput)) ? "" : "not ";
        System.out.println("\"" + userInput + "\" is " + isNum + "a number");

        System.out.println("Flipped Case: " + swapCase(userInput));

        System.out.println("Reversed: " + reverse(userInput));
    }
}
