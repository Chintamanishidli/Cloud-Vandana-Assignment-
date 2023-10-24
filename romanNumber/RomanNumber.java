package assignment;
import java.util.HashMap;
import java.util.Scanner;

public class RomanNumber {
    public static int romanToInt(String s) {
        // Create a HashMap to store the values of Roman numerals
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0; // To keep track of the previous value

        // Iterate through the Roman numeral from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int value = romanValues.get(s.charAt(i));

            // If the value of the current Roman numeral is less than the previous one, subtract it
            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }

            prevValue = value;
        }

        return result;
    }

    public static void main(String[] args) {
       // String romanNumeral = "IX";
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("enter the number : ");
    	String n = scanner.next();
        int result = romanToInt(n);
        System.out.println(n + " = " + result); // Output: "IX = 9"
    }
}
