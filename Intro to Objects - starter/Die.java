//********************************************************************
//  Die.java
//
//********************************************************************

import java.util.Random;
import java.util.Scanner;
public class Die
{
    Scanner keyboard = new Scanner(System.in);
    private final int MIN_FACES = 4;

    private static Random generator = new Random();
    private int numFaces;   // number of sides on the die
    private int faceValue;  // current value showing on the die

    /**
    Defaults to a six-sided die. Initial face value is 1.
     */
    public Die ()
    {
        numFaces = 6;
        faceValue = 1;
    }

    /**
    constructor
    Explicitly sets the size of the die. Defaults to a size of
    six if the parameter is invalid < MIN_FACES.
    Initial face value is random.
    @parm int number of sides of the die
     */
    public Die (int sides)
    {
        while (sides <= 2) 
        {
            System.out.print("Number of sides must be greater than 2, try again: ");
            sides = keyboard.nextInt();
        }

        numFaces = sides;
        faceValue = 1;
    }

    /**
    Rolls the die and returns the result.
    @return int faceValue
     */
    public int roll ()
    {
        Random gen = new Random();
        faceValue = gen.nextInt(numFaces);
        return faceValue;
    }

    /**
    Returns the current die value.
    @return int faceValue
     */
    public int getFaceValue ()
    {
        return faceValue;
    }

    /**
    Returns the current number of faces the die has.
    @return int numFaces
     */
    public int getFaces()
    {
        return numFaces;
    }

    /**
    Sets the number of faces of the Die
    @param int faces
     */
    public void setFaces(int faces)
    {
        numFaces = faces;
        return;
    }

    /**
    Returns the current die value and number of sides as a String.
    @return a string of faceValue and numFaces
    !!! if you do not write toString it will output the class name and the memory address
     */
    public String toString ()
    {
        String data ="";
        data = "Face Value: "+ faceValue + " - Number of Faces: " + numFaces;
        return data;
    }

}//end of class Die
