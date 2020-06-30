import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;
import static org.apache.commons.lang3.StringUtils.reverse;
import static org.apache.commons.lang3.StringUtils.swapCase;

public class DependencyMgmtExercise {

    public static void main(String[] args) {
        // prompt user for input and
        // tell whether input is a number
        // flip the case of the string
        // reverse the string

        Scanner sc = new Scanner(System.in); // .useDelimiter("\n");

        String strPrompt = "Please enter something: ";
        System.out.println(strPrompt);
        String userInput = sc.nextLine();
        System.out.println("You entered: \"" + userInput + "\"");

        // Print output
        String isNum = (StringUtils.isNumeric(userInput)) ? "" : "not ";
        System.out.println("\"" + userInput + "\" is " + isNum + "a number");
        System.out.println("Flipped Case: " + swapCase(userInput));
        System.out.println("Reversed: " + reverse(userInput));
    }
}
