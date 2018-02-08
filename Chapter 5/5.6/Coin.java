/* Using the Coin class defined in this chapter, 
   design and implements a driver calss called 
   FlipRace whose main method creates two Coin 
   objects, the continually flips them both to 
   see which coin first comes up heads three flips 
   in a row.  Continue flipping the coins until one 
   of the coins wins the race, and consider the 
   possiblity that they might tie.  Print the results 
   of each turn, and at the end print the winner and 
   total number of flips that were required. */
   
public class Coin {
    private final int HEADS = 0;
    private final int TAILS = 1;
    private int face;
    public Coin() {
        flip();
    }        
     public void flip() {
        face= (int)(Math.random()*2);
    }
    public boolean isHeads () {
        return (face == HEADS);
    }
     public String toString() {
        String faceName;
        if (face == HEADS)
            faceName = "Heads";
        else 
            faceName = "Tails";
        return faceName;
    }
}

