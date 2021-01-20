//
/**
 * Write a description of class Coin here.
 *
 * @author (Pushkar Betsur )
 * @version (V.1.0 12-18-20)
 */
import java.util.Random; 
import java.util.Scanner; 

public class Coin
{
    // instance variables - replace the example below with your own
    private final int HEADS = 0; 
    private final int TAILS = 1; 
    private Random gen = new Random(); 
    private int face;

    
    /**
     * Constructor for objects of class Coin
     */
    public Coin()
    {
        // initialise instance variables
        face = HEADS;
    }
/*
 * Constructor - takes an int 0-1 and set the face
 */
public Coin(int value)
{
     flip();   // you can call methdods from inside the class
    
}
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int flip ()
   {
        if (gen.nextInt(2)==1)
    {       face = TAILS; 
            //return TAILS; 
    }
        else 
    {       face = HEADS; 
            //return HEADS; 
    }
    return face;
    // Math.random () returns number between 0-1 --. 9.
    //face = (int) (Math.random()*2);  
    
   }
   
   /**
    * Who's responsibility is it to keep track of Heads/Tails???
    */
   /**
    * getFace - will return the face as an in 
    * @return int face of 0 or 1
    */
   public int getFace()
   {
       return face; 
       
    }
    /**
     * toString
     * returns the Data in a String Format
     * @return String - face as "Heads"" or "Tails"
     */
    public String  toString()
    {
       String faceName = "0"; 
       if (face == HEADS)
        faceName = "Heads"; 
       else 
        faceName = "Tails"; 
       return faceName; 
    }
 public void setFace(int face)   
 {
      
    }
}
