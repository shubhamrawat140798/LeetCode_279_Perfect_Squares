package LeetCode279.sumOfMinSquareOfNumber;

public class SumOfMinSquare {
    private SumOfMinSquare() {

    }
    /**
     *
     * @param numberInput - Input from User.
     * @return Int as result
     */

    public static int findSumOfMinSquare(final int numberInput) {
        // auxiliary array[] which  stores the minimum number
        // sum of squares to IndexOfAuxiliaryArray.
        int[] auxiliaryArray = new int[numberInput + 1];

        // fill the auxiliary array in a bottom-up fashion.
        for (int indexOfAuxiliaryArray = 0;
             indexOfAuxiliaryArray <= numberInput;
             indexOfAuxiliaryArray++) {
            // auxiliaryArray initialized with maximum number square
            auxiliaryArray[indexOfAuxiliaryArray] = indexOfAuxiliaryArray;

            // loop all the positive integers <  or == to the
            // square root of indexOfAuxiliaryArray
            for (int positiveInteger = 1;
                 positiveInteger * positiveInteger <= indexOfAuxiliaryArray;
                 positiveInteger++) {
                // Storing Smaller result in the
                // auxiliaryArray[indexOfAuxiliaryArray]
                auxiliaryArray[indexOfAuxiliaryArray] =
                        Integer.min(auxiliaryArray[indexOfAuxiliaryArray],
                                1 + auxiliaryArray[
                                        indexOfAuxiliaryArray
                                        - positiveInteger * positiveInteger
                                ]);
            }
        }
        return auxiliaryArray[numberInput];
    }
}
