public class StringManip
{
    /** Takes a string str and returns a new string * with all spaces removed.
     */
    public static String removeSpaces(String str)
    {
        String noSpace = "";
        for (int i=0; i<str.length(); i++) {
            if (!str.substring(i, i+1).equals(" ")) {
                noSpace += str.substring(i, i+1);
            }
        }
        return noSpace;
    }


    /** Takes a string str and returns a new string
     * with the characters reversed, as described in part (a). */
    public static String reverseString(String str)
    { /* to be implemented in part (a) */
        String removed = removeSpaces(str);
        String outcome = "";
        for(int i = removed.length() ; i>0; i--){
            String letter = removed.substring(i-1,i);
            outcome += letter;
        }
        return outcome;
    }


    /** Determines whether str is a palindrome and prints a message
     * indicating the result, as described in part (b).
     * Precondition: str contains only lowercase letters and spaces.
     */
    public static void palindromeChecker(String str)
    { /* to be implemented in part (b) */
        String spaceRemoved = removeSpaces(str);
        String reversed = reverseString(spaceRemoved);
        if(spaceRemoved.equals(reversed)){
            System.out.println(str + " is a palindrome");
        }
        if(!spaceRemoved.equals(reversed)){
            System.out.println(str + " is not a palindrome");
        }
    }

}