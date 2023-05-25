package Week04;


/**
 Write a program that accepts sets of three numbers,
 and prints the second-maximum number among the three.
 **/

public class SecondMaxNumber {

    public static void main(String[] args) {
        System.out.println("The second max number is: " + secondMax(10, 8, 11));

    }

    static int secondMax(int num1, int num2, int num3){

        //define min and max of the numbers
        int max = Math.max(num1, Math.max(num2, num3));
        int min = Math.min(num1, Math.min(num2, num3));

        // get the second max
        int secondMax = num1 + num2 + num3 - max - min;
        return  secondMax;
    }
}

