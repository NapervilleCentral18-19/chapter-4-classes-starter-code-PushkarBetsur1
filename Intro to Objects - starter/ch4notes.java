/********************************************************************
// These are the notes for ch 4 used in hayes class
//******************************************************************* */


import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.*;

public class ch4notes
{

 //static int sum = 987654;

public static void main (String[] args)
{   
    //class id     new constructor
    mathy solver = new mathy();
    int value = -54;
    System.out.println(solver.abs(-5)); 
    //System.out.println(solver.abs(-5));
    //System.out.println(abs(-8));
    //String word = abs(9);
    double number = abs(9);
    System.out.println(abs(-8));
    System.out.println(abs(value)); //does not send variable, sends value of var
    System.out.print(abs(-8.9));
    System.out.println(value); 
    
    }// end of main
    /**/
    Coin dime = new Coin(); 
{
    for (int i = 0; i <10; i++)
    {
    System.out.println(dime.flip());
}
System.out.print(dime.getFace());
}
    /**
    take the absoulute value of the number
    @param int value
    @return absoulute value of number
    */
   //       return          parameter
   public static int abs( int value ) // value scope is the method 
   {
       if (value < 0 )
        value = -value; 
        
       return 0;
    }

   /**
    take the absoulute value of the number
    must change the parameters - number of or type of 
    @param double value
    @return absoulute value of number
    */

   public static double abs(double value)
   {    if (value < 0 )
            value = -value;
       
      return 0.0;  
    }
public static double ()
{
    
}
    

}// end of class









