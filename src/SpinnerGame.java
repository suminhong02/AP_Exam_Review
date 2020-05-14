public class SpinnerGame {
    /** Precondition: min < max
     * Simulates a spin of a spinner by returning a random integer
     * between min and max, inclusive.
     */
    public int spin(int min, int max)
    {
        int result;
        result = (int)(Math.random()*max)+min;
        return result;
    }
    /** Simulates one round of the game as described in part (b).
     */
    public void playRound() {
        int player = spin(1,10);
        int computer = spin(2,8);
        if(player > computer){
            System.out.println("You win! " + (player-computer) + " points");
        }
        if(player < computer){
            System.out.println("You lose. " + (computer-player) + " points");
        }
        else{
            int player2 = spin(1,10);
            int computer2 = spin(2,8);
            if(player2 == computer2){
                System.out.println("Tie. 0 points");
            }
            if(player2 >computer2){
                System.out.println("You win! " + (player2-computer2) + " points");
            }
            if(player2 <computer2){
                System.out.println("You lose. " + (player2-computer2) + " points");
            }
        }


    }
}
