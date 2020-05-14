public class Hailstone {

    /** Returns the length of a hailstone sequence that starts with n,
     * as described in part (a).
     * Precondition: n > 0
     */
    public static int hailstoneLength(int n) {
        /* to be implemented in part (a) */
        int count = 0;
        while(n>0){
            if(n == 1){
                count++;
                break;
            }
            if(n%2 == 0){
                n/=2;
                count++;
            }
            else{
                n= (3*n)+1;
                count++;
            }
        }
        return count;
    }


    /** Returns true if the hailstone sequence that starts with n is considered long
     * and false otherwise, as described in part (b).
     * Precondition: n > 0
     */
    public static boolean isLongSeq(int n) {
        /* to be implemented in part (b) */
        int hailstonelength = hailstoneLength(n);
        if(hailstonelength > n){
            return true;
        }
        else{
            return false;
        }
    }


    /** Returns the proportion of the first n hailstone sequences that are considered long,
     * as described in part (c).
     * Precondition: n > 0
     */
    public static double propLong(int n) {
        /* to be implemented in part (c) */
        double count = 0.0;
       for(int i = n; i>0; i--){
           if(isLongSeq(i)){
               count++;
           }
       }
       return (double)(count/n);
    }

    // There may be instance variables, constructors, and methods not shown.
}
