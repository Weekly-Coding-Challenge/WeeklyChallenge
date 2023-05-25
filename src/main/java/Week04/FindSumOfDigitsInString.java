package Week04;

/**
 * Given an alphanumeric string made up of digits and lower case Latin characters only,
 * find the sum of all the digit characters in the string.
 */

public class FindSumOfDigitsInString {

    public static void main(String[] args) {

        String str = "Name123";

        System.out.println("The sum of the digits in  `" + str  + "` is: " + getDigitSum(str) );

    }

    static int getDigitSum(String str){
        int sum = 0;
        for (char c: str.toCharArray()){
            if (Character.isDigit(c)){
                sum += Character.getNumericValue(c);
            }
        }
        return sum;
    }
}
