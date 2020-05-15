import java.util.ArrayList;

public class OnlinePurchaseManager {
    /** An ArrayList of purchased Gizmo objects,
     instantiated in the constructor. */
    private ArrayList<Gizmo> purchases;
    /** Returns the number of purchased Gizmo objects that are
     electronic and are
     * manufactured by maker, as described in part (a).
     */
    public int countElectronicsByMaker(String maker)
    { /* to be implemented in part (a) */
        int counter = 0;
        for(Gizmo g: purchases){
            if(g.getMaker().equals(maker) && g.isElectronic()){
                counter++;
            }
        }
        return counter;
    }
    /** Returns true if any pair of adjacent purchased Gizmo
     objects are equivalent, and
     * false otherwise, as described in part (b).
     */
    public boolean hasAdjacentEqualPair()
    { /* to be implemented in part (b) */
        for(int i = 0;i<purchases.size(); i++){
            if(purchases.get(i).equals(purchases.get(i+1))){
                return true;
            }
        }
        return false;
    }
    // There may be instance variables, constructors, and methods
    //not shown.
}

//method header: public Gizmo getCheapestGizmoByMaker(String maker){}
//add price variables and getPrice method in order to get the price of the Gizmo