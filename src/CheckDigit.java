public class CheckDigit {
    /** Returns the check digit for num
     * Precondition: The number of digits in num is between one and
     six, inclusive.
     * num >= 0
     */
    public static int getCheck(int num)
    { /* implementation not shown */
    }
    /** Returns true if numWithCheckDigit is valid, or false
     otherwise,
     * as described in part (a)
     * Precondition: The number of digits in numWithCheckDigit
     is
     * between two and seven, inclusive.
     * numWithCheckDigit >= 0
     */
    public static boolean isValid(int numWithCheckDigit)
    { /* to be implemented in part (a) */
        if(numWithCheckDigit%10 == getCheck(numWithCheckDigit)){
            return true;
        }
        else return false;
    }
    // There may be variables and methods not shown.
    // (c) There should be a new method made to keep track of the number of false and returns the number of invalid check made
    // There should also be a new variable called counter to keep track of the number of times a call to incorrect check.
}
