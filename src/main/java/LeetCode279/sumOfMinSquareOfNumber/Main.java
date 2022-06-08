package LeetCode279.sumOfMinSquareOfNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // for Automatic resource management.
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("\n Enter a the Number: ");
            int numberInput = scanner.nextInt();
            // For taking input form user.
            System.out.println(" Output: "+ SumOfMinSquare.findSumOfMinSquare(numberInput));

        }
        catch (Exception e){
            System.out.println("Exception Occur \n"+e);
        }
    }

}
